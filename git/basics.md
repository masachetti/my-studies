# Git Basics

## Git Config

To change user name:

    git config --global user.name "Mateus Sachetti"

To change user email:

    git config --global user.email "mateus.sachetti@gmail.com"

To change git text editor

    git config --global core.editor editor_name

    # Example:
    git config --gloval core.editor sublime

To reset a config parameter:

    git config --global --unset {parameter}
    git config --global --unset user.email

To view all config parameters:

    git config --list

## Create a new repository

Go to the folder where the repository will be created and initialize it.

    git init

## Syncing the local repository with the server

    git remote add origin {server-repository-link}
    git push origin master

## Status

    git status

## Add

To add a modified file to be committed use:

    git add file_name

## Commit

To send the changes to the repository use:

    git commit -m "Some Message"

Also can add and commit a file using:

    git commit -am "Some Message"
