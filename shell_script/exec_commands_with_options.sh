#!bin/bash 

echo "1 for list the directories"

echo "2 for current working directory"
echo "3 to exit " 

read -p "enter your choice" c 
case  $c in 
	1) ls -l 
	;;
	2) pwd
	;;
	3) exit 0 
	;;
esac
