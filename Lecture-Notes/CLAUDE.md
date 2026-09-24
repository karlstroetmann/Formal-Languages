# Lecture notes "Formal Languages and Their Applications"

## Building

```
pdflatex -shell-escape formal-languages.tex
```

- `-shell-escape` is required: `minted` calls `pygmentize`, and `imakeidx` runs `makeindex` automatically.
- Run it 2–3 times so that references, the index, and the list of notation settle.  A clean build has
  0 errors and no "multiply defined" or "undefined reference" warnings.
- The bibliography needs `bibtex formal-languages` only when `cs.bib` or the `\cite`s change.
- The tracked build outputs `formal-languages.pdf` and `formal-languages.idx` are committed together with
  source changes.

## Structure

- `formal-languages.tex` is the main file: preamble (grouped by purpose, `hyperref`/`glossaries` last),
  then the `\include`d chapters.  Only the chapters that are `\include`d there are part of the book;
  several other `.tex` files in this directory are old, unused chapters.
- Chapter order: introduction, regular-expressions, scanners, finite-state-machines, regular-languages,
  context-free-languages, lark, lark-interpreter (chapter 8), earley-parser, shift-reduce-parser +
  lr-parser (chapter 10), lark-lalr, jasmin, compiler + compiler-2 (chapter 13).
- `notation.tex` holds the entries of the *List of Notation* (package `glossaries`).
- The Python notebooks live in `../Python/Chapter-NN/`, numbered like the chapters
  (`Chapter-04-05` covers chapters 4 and 5).  They run in the conda environment `fl`, e.g.
  `conda run -n fl jupyter nbconvert --to notebook --execute --output /tmp/out.ipynb X.ipynb`;
  the Homebrew Python lacks the required packages.  Old Ply versions are archived in `../Python/Ply/`.
- Type checking of notebooks: the notebooks of chapters 2 and 3 use basedpyright
  (`conda run -n fl basedpyright X.ipynb`; live in JupyterLab via jupyterlab-lsp).  Its settings are in
  `../Python/pyrightconfig.json` (mode "standard"; the default mode warns about every unused return value,
  e.g. of `outfile.write`).  JupyterLab is started in `../Python`, so the language server finds this file.
  The older notebooks use `%load_ext nb_mypy`, which breaks on `match` statements and `type X = ...` (its
  dependency astor cannot unparse them) and needs forward declarations for mutually recursive functions.

## Conventions

- New notions are introduced as `\blue{term}` followed by `\index{term}`.  Index entries that start with a
  formatting command need a sort key, e.g. `\index{DFA@\simtextsc{Dfa}}`.  Use singular forms and English.
- Notation gets an entry in `notation.tex` plus `\glsadd{key}` at the place where it is defined
  (`\glsadd` prints nothing).
- `\simtextsc{...}` fakes small caps (the font Atkinson Hyperlegible has none).
- Code listings use `minted`.  Listings that show notebook code must match the notebook
  (`../Python/Chapter-13/Compiler.ipynb` for chapter 13).
- The page layout is A4 with a 17cm text block.  The author does not want text or fonts to become smaller.

## Pitfalls

- `minted` listings that are too wide do not produce "Overfull \hbox" warnings; check the PDF itself.
- The login shell is zsh: unquoted `$VAR` lists are not word-split, and `set -- $x` does not split.

## Working with the author

- Ask before changes whose outcome is a matter of taste or content; the author prefers to be asked when
  in doubt.
- Commit and push only after the author has agreed.
