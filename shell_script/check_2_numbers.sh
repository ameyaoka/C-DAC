#!/bin/bash
read -p "Enter two numbers: " num1 num2

if [[ $num1 -eq $num2 ]]
then
    echo "Numbers are the same"
else
    echo "Numbers are different"
fi

