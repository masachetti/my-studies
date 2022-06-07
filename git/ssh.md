# Configurating SSH Key

## Generate SSH Key

To create a pair of SSH Keys:

    ssh-keygen -t {cryptography type} -C {e-mail}
    ssh-keygen -t ed25519 -C mateus.sachetti@gmai.com

Add a password if desired, otherwise continue with the key generation.

## Inserting SSH Public Key on GitHub

Go to the path where the SSH keys are generated in the previous step and open and copy the .pub file content.

Go to the [GitHub](https://github.com/) website > SSH and GPG Keys > Add new SSH Key.

Write a title and paste the SSH Key copied in the previous step.

## Configurating SSH Private Key to use on Git

Go to the path where the SSH keys are located and inicialize the ssh-agent:

    eval $(ssh-agent -s)

Now add the desired SSH Private Key to the agent:

    ssh-add {file_name}
    ssh-add id_ed25519

If a password was specified in the first step, then will need to provide it now.

