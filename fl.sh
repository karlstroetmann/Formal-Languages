conda create -n fl
conda activate fl
conda install -y -c conda-forge python=3.14 jupyterlab 
conda install -y -c conda-forge graphviz
conda install -y -c conda-forge python-graphviz
pip install basedpyright      # type checker based on Pyright, used by all notebooks
pip install jupyterlab-lsp    # shows the errors found by basedpyright in JupyterLab while typing
pip install lark
pip install interegular
pip install matplotlib        # plots, e.g. in Chapter-03/03-Exam-Evaluation.ipynb


