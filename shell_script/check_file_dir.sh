#!/bin/bash



# Prompt the user to enter a file name
read -p "Enter the file name: " filename

# Check if the file exists in the current directory
if [ -e "$filename" ] 
then
    echo "The file $filename is present in the current directory."
else
    echo "The file $filename is not found in the current directory."
fi

