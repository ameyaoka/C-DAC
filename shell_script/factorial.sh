


#!/bin/bash
echo "Enter a number to find factorial:"
read num
fact=1
x=1

while [ $x -le $num ]
	do
		fact=$((fact * x))
		x=$((x + 1))
done

echo "Factorial of $num is: $fact"

