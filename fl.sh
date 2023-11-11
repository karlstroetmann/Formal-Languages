# The first group of commands can be used to install Python 3.10. This version supports matching.
conda create -n fl python=3.11 jupyter notebook
conda activate fl
conda install -y -c conda-forge ply
conda install -y -c conda-forge antlr4-python3-runtime
conda install -y -c conda-forge antlr
conda install -y -c conda-forge graphviz
conda install -y -c conda-forge python-graphviz
python3 -m pip install nb_mypy
