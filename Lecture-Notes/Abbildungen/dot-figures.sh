#!/bin/sh
# Regenerates the figures that are drawn with Graphviz.  For every NAME.dot
# this script writes NAME.pdf, which is included in the lecture notes.  The
# NFAs A(r) built from a regular expression r are also needed as
#
#   ../../Python/Chapter-04-05/NAME.jpg   used in 03-Regexp-2-NFA.ipynb
#
# Usage: ./dot-figures.sh [NAME ...]    (without arguments: all figures)
#
# The labels are set in the fonts of the lecture notes: Latin Modern Math,
# Latin Modern Mono and Atkinson Hyperlegible.  TeX Live ships these fonts,
# but macOS does not know about them.  Therefore Pango is told to look up
# fonts via fontconfig and fontconfig is told where TeX Live keeps them.

set -e
cd "$(dirname "$0")"

nfas="aLeer aEpsilon aChar aConcat aPlus aStar"
others="abstara abstarbabab abstarbabab-nd ab-or-ba-star a2 exercise-13
        nicht-gleichwertig gleichwertig
        abstract-syntax-tree abstract-syntax-tree-prod cc-LR cc-LALR"
if [ $# -eq 0 ]; then
    set -- $nfas $others
fi

conf=$(mktemp)
trap 'rm -f "$conf"' EXIT
{
    echo '<?xml version="1.0"?>'
    echo '<!DOCTYPE fontconfig SYSTEM "fonts.dtd">'
    echo '<fontconfig>'
    echo '  <include ignore_missing="yes">/opt/homebrew/etc/fonts/fonts.conf</include>'
    for font in latinmodern-math.otf lmmono10-regular.otf \
                Atkinson-Hyperlegible-Regular-102.otf; do
        echo "  <dir>$(dirname "$(kpsewhich $font)")</dir>"
    done
    echo '</fontconfig>'
} > "$conf"
export FONTCONFIG_FILE="$conf" PANGOCAIRO_BACKEND=fc

for name in "$@"; do
    dot -Tpdf "$name.dot" -o "$name-uncropped.pdf"
    pdfcrop --margins 2 "$name-uncropped.pdf" "$name.pdf" > /dev/null
    rm "$name-uncropped.pdf"
    case " $nfas " in
        *" $name "*)
            pdftoppm -r 150 -jpeg -jpegopt quality=95 -singlefile \
                     "$name.pdf" "../../Python/Chapter-04-05/$name" ;;
    esac
done
