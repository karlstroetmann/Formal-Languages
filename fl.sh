# The first group of commands can be used to install Python 3.10. This version supports matching.
conda create -n fl
conda activate fl
conda install -y -c conda-forge python=3.10 jupyter notebook
conda install -y -c conda-forge ply
conda install -y -c conda-forge antlr4-python3-runtime
conda install -y -c conda-forge antlr
conda install -y -c conda-forge graphviz
conda install -y -c conda-forge python-graphviz

# This group of commands installs python 3.9.
conda create -y -n fl python=3.9 jupyter notebook
conda activate fl
conda install -y -c anaconda ply
conda install -y -c conda-forge antlr4-python3-runtime
conda install -y -c conda-forge antlr
conda install -y -c anaconda graphviz
conda install -y -c conda-forge python-graphviz

