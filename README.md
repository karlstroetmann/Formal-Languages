Formal-Languages
================
[![Binder](https://mybinder.org/badge_logo.svg)](https://mybinder.org/v2/gh/karlstroetmann/Algorithms/HEAD)

Lecture notes and examples for my class on formal languages and compilers.

# Docker (Experimental Feature)

The notebooks available in this repository can be run via [Docker](https://www.docker.com).
In order to be able to store changes made to these notebooks it is beneficial to create a local directory `Solutions` that will be linked to the directory `Python/Personal-Solutions`.  The permissions of the directory `Solutions` need to be set to `777`.  For example, with `linux` creating this directory and setting the permissions is achieved with the following commands:
```
    cd
    mkdir Solutions
    chmod 777 Solutions
```
Then, in order to change a file in the docker container and have the changes persist, inside the docker
container the file has to be copied to `Python/Personal-Solutions`.

The docker image can be downloaded via the following command:
```
    docker pull karlstroetmann/formal-languages
```
After that, the *container* can be started as follows:
```
docker run -p 8888:8888 -v /Users/yourname/Solutions/:/home/jovyan/Python/Personal-Solutions karlstroetmann/formal-languages
```
Note that you have to replace the directory `/Users/yourname` with your home directory.
Unfortunately, you cannot specify your home directory as `~`, since `Docker` does not
understand this notation.

To connect to the container, enter the adress `localhost:8888` into your browser.
You will then be asked for a *token*.  You find this token in the message that is
displayed by the `docker run ...` command executed previously.

### Important notes:
* **FileNotFoundError: [Errno 2] No such file or directory: 'xdg-open'**: Set `.render(view=False)`, because files can not be opened automatically
* `antlr4` command is available
* The path to antlr4.jar is `/home/jovyan/.local/antlr-4.8-complete.jar`