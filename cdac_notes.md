# Cdac Notes  

## module 1 - linux and cloud computing 






chmod --- change modification 

chgrp group_name file_name  -----> change group of file 

chown 


usermod  -aG [group_name] [username]

example 

>  usermod -aG cdac_group student_1

- by using above command we can add student_1 to cdac_group 

- check user added to group  

- How to check if user is added to group 
> group_name user_name 


> chomod r=rx , g=r , o=e

- o is for assigning permission 


> chmod u+rwx file_name  


getfacl  --- listed permission about the file 
- 

> setfacl -m u:student:r file_name 




> setfacl -m g:cdac_group:rx file_name 

 

- remove all persmission from file 
> setfacl -b file name  



- In linux file authorization is divided into two parts : 1. permission model 2. ownership 

- linux file ownership : this gives the information aout file or directory owner ( this means file elong to which owner or group ) 

- this is further divided into three parts 

1. user
2. group 
3. others

- users are those who own the file bydefault those who create the file is the owner .
- These owners hold some attributes like id . this will print user_id , group_id others id , and this id's have some predefined meaning ie: 0 - means the ownership is with root and 0 has been reserved for root . 

- userid : this is also called as user identiy  or uid  that is assinged to user to identify the type of the user and to understnd thee system resources utilizaion.
- There are range for this id's :
	0 : root 
	1-99 :  reserved for predefined accounts 
	100-999 : reserved for system administrator 
	1000 - 10000 : reserved for application account 



group : a group contains multiple users . all users elongging to same group have same set of persissino avvess to fiel s

group permissions are owned by the grpoup that own the files/dir

- like user , groups ahve some attriutes called gid or group idetntiy , htis determined tehe system resources .

- the name for id varies 

- 0 is reserved for root  
- 100 - 200 - reerved for sytstem and application

- 100 - aove : allocated to user group .


- share file to remote computer using scp 

- scp [hostname]@[ipaddress] [file_address] [destination_host]@[destination_ip] [destination address] 



	 




























- 
