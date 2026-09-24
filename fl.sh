conda create -n fl
conda activate fl
conda install -y -c conda-forge python=3.14 jupyterlab 
conda install -y -c conda-forge graphviz
conda install -y -c conda-forge python-graphviz
pip install mypy
pip install nb-mypy           # type checking with mypy in the older notebooks
pip install basedpyright      # type checker based on Pyright, e.g. for Chapter-02/Regular-Expressions.ipynb
pip install jupyterlab-lsp    # shows the errors found by basedpyright in JupyterLab while typing
pip install lark
pip install interegular


