#!/bin/bash
read -p "Enter a number: " num

if [ $num -gt 0 ]
then
    echo "Number is greater than 0"
else
    echo "Number is not greater than 0"
fi

