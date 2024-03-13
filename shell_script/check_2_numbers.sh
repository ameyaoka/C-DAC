#!/bin/bash
read -p "Enter number:" num1 num2

if [ "$num1" -eq "$num2" ]
then
    echo "$num1 and $num2 are equal"
else
    echo "$num1 and $num2 are not equal"
fi


