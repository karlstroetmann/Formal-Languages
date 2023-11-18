# The first group of commands can be used to install Python 3.10. This version supports matching.
conda create -n fl
conda activate fl
conda install -y -c conda-forge python=3.11 jupyter notebook
conda install -y -c conda-forge ply
conda install -y -c conda-forge antlr4-python3-runtime
conda install -y -c conda-forge antlr
conda install -y -c conda-forge graphviz
conda install -y -c conda-forge python-graphviz

