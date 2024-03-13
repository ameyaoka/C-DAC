#!/bin/bash

# Prompt the user to enter a number
read -p "Enter a number: " num

# Check if the number is greater than zero
if [[ $num -gt 0 ]] 
then
    echo "The number is greater than zero"
else
    echo "The number is not greater than zero"
fi

