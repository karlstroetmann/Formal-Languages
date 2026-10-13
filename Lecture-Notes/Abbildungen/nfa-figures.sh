#!/bin/sh
# Regenerates the figures of the NFAs A(r) that are built from a regular
# expression r.  For every NAME.dot below this script writes
#
#   NAME.pdf                              used in ../finite-state-machines.tex
#   ../../Python/Chapter-04-05/NAME.jpg   used in 03-Regexp-2-NFA.ipynb
#
# The labels are set in the font Latin Modern Math.  TeX Live ships this
# font, but macOS does not know about it.  Therefore Pango is told to look
# up fonts via fontconfig and fontconfig is told where TeX Live keeps the font.

set -e
cd "$(dirname "$0")"

fontdir=$(dirname "$(kpsewhich latinmodern-math.otf)")
conf=$(mktemp)
trap 'rm -f "$conf"' EXIT
cat > "$conf" <<EOF
<?xml version="1.0"?>
<!DOCTYPE fontconfig SYSTEM "fonts.dtd">
<fontconfig>
  <include ignore_missing="yes">/opt/homebrew/etc/fonts/fonts.conf</include>
  <dir>$fontdir</dir>
</fontconfig>
EOF
export FONTCONFIG_FILE="$conf" PANGOCAIRO_BACKEND=fc

for name in aLeer aEpsilon aChar aConcat aPlus aStar; do
    dot -Tpdf "$name.dot" -o "$name-uncropped.pdf"
    pdfcrop --margins 2 "$name-uncropped.pdf" "$name.pdf" > /dev/null
    rm "$name-uncropped.pdf"
    pdftoppm -r 150 -jpeg -jpegopt quality=95 -singlefile \
             "$name.pdf" "../../Python/Chapter-04-05/$name"
done
