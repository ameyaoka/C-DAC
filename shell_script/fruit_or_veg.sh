#!/bin/bash

read -p "Enter your choice: " c

case $c in
    mango|watermelon|lichi)
        echo "This is a fruit"
        ;;
    spinach|cabbage|pumpkin)
        echo "This is a vegetable"
        ;;
    nothing) 
        exit 0
        ;;
esac

