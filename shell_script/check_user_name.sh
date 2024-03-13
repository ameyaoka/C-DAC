
#!/bin/bash 

username="CDAC"

read -p "Enter user name" uname 

if [[ $username = $uname ]]
then
	echo " user name is correct" 
else 
	echo " user name is not correct" 

fi 


