# How to create a library in Python

## Folder structure

First thing is to structure the project folder properly:

> - Whatever-folder-name
>   - setup.py
>   - README.md
>   - my-package-name
>     - \_\_init__.py
>     - \_\_version__.py
>     - Other files and folders
>     - ....

## Setup.py

The setup file is a script to build the package and must contain the information about it.

``` python
from setuptools import find_packages, setup
from my-package-name import __version__

setup(
    # Repeat the package folder name
    name='my-package-name',
    packages=find_packages(),
    # Use this version to determine what to include
    # packages=find_packages(include=['mypythonlib']),
    version=__version__,
    description='My first Python library',
    author='Me',
    license='MIT',
    # Insert here the requeriments
    install_requires=[],
    # Other things that can be added
    # setup_requires=['pytest-runner'],
    # tests_require=['pytest==4.4.1'],
    # test_suite='tests',
)
```

## Just install

In the project root folder type the command:

Obs: Check if the properly virtual environment is activated

``` bash
python setup.py install
```

## Building

In the project root folder type the command:

``` bash
python setup.py bdist_wheel
```

## Build installation

With the properly virtual environment activated type:

``` bash
pip install project-root-folder/dist/file-name.whl
```
