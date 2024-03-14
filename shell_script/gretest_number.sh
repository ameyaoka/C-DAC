#!/bin/bash



read -p "Enter three numbers: " num1 num2 num3

if [ "$num1" -gt "$num2" ] && [ "$num1" -gt "$num3" ]
then
echo "$num1 is the largest number."
elif [ "$num2" -gt "$num1" ] && [ "$num2" -gt "$num3" ]
then
echo "$num2 is the largest number."
else
echo "$num3 is the largest number."
fi






