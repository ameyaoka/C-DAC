#Cdac Notes  

## module 1 - linux and cloud computing 






chmod --- change modification 

chgrp group_name file_name  -----> change group of file 

chown 


usermod  -aG [group_name] [username]

example 

>  usermod -aG cdac_group student_1

- by using above command we can add student_1 tgemeo cdac_group 

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


## cloud 
	 
1. what is cloud 

- cloud computing is the services that are provided over network (internet ) , which helps you to process the data by using paid / free services . 
- In cloud computing you pay for the services that you are going to use .

In cloud computing computing means processing any data or modifying any data  where as coud stands for network /internet that provides services 

- **cloud computing** 
1. service model 
	- SAAS 
	- PASS 
	-
	- 
	
2. types of cloud 

	- public 
	- private 
	- hybrid 
	- community 


- A data center: is a facility that is used to store manage and distribute large amount of data . This is typically a location or center point where large numbber of computer or systems or computing devices  ,networking equipments , storage devices work together to support processing .

- storing and processing of data 

- a data center is used to store and process a large amount of data  which includes files / database and any digital informaiton 

- a data center can be used for backup and data recovery . This backups are useful during disasters 

- Allows the business to access computing resources over the internet .

- We can run application  like email , social media platform services on data center .

- To maintain a data center we need cooling electricity and power backup .



- **on premises** - It is a traditional approach where all the data , hardware and software are hosted physically on an organization / for organization .

- **Off premises** - It means the cloud provider provides the services which emans you have to pay for the services that you are using . Off premises is virtually located that gives you computing and another  services on demand .

- Difference between on premises and  off premises .

- **On premises** 
	- we need to buy all the licenses for and software buy hardware.
	- It needs lot of space and security to run and maintain .
	- Backup is not centralized .
	- We need people /team to maintain hardware/software
	 


- **Off premises**
	- we buy hardware and software according to uses.
	- Servers in data centers are managed by data centers owners .
	- backup is centralized.
	- We don't need people /team to maintain hardware/software.

### data center

- data center comprises of :
	- servers: servers are used to process the request an delivery of the responce over cloud .
	- networking equipment : this comprises of switches adn routers and connects multiple networks to send and receive any data .
	- server rack : It is used to organize servers and another network equipments .
	- cooling devices and power rack : services providesb



- Data centers provide  services under 4 tiers 

1. tier 1 - it provides  only power supply
2. tier2 - it provides  power supply and coolng 
3. tier 3 - provide cooling powersupply with maintainance 
4. tier 4 -  provide cooling powersupply with maintainance and backup with protection .

- The largest data center is present is bejing china 
- The largest data center  in india is in noida .
-  The largest data center  of aws is north Virginia . 

### types of data centers 

1. **Enterprise data centers** : This kind of datacenters are owned by particular orginization  and operated by thos organization .
- these datacenters can be on premises or off premises . 
- the primary function of data centers is provide secure data and critical application  example : amazon , apple , Tesla , Microsoft .

2.**cloud data center**: These data centers are owned / operate by services like : aws azure google .
- these provides  infrastructre and software to the organization .

3. **colocation** : these kind of data centers are hoste by 3rd party orgization and are used y orginazation . 
- the third aparty organization provide power to the data center . while organization provide power , storage , hardware and network .

- The company can have equipments located at multiple locations .company can have their devices maintained and secured.
- Benefits of this kind of data centers are that it is cheaper that other types as few of the resources rented . It can also be located at any geographical location 

4. **edge data center** : It is closely located to end user these are used  organization providing IOT device .

- benefits of this data center are These are located closer to organization .

5. **Hybrid data centers** : 
- This types of data centers are combination of on premises and off premiers data center .
- They are integrated  in the form of data enter  where traditional on premises provide infrastructure  such as storage , network , server and network equipmnents  with cloud resources  from one or more cloud service provider .
- This  kinds of data centers are dynamically allocate the load between on premises and off premises 




- we use cloud to connect to a data center .
- cloud is a virtual resources while data center is a physical resources. 
- In cloud it is easier to scale up and down as per our requirement where as in a data center we need to plan and invest in hardware and software .

### service model 
- It provides services to process , store and compute data on the remote server .

- These cloud services are further divided in to
1. **IAAS** : Infrastructre as service  
	-  infrastructre 
	- computing
	- Os 

2. **PAAS** - platform as a service 
	-  platform 

3. **SAAS** - software as a service 
	- 

4. **xaas** : anything and everityhing as a service .

5 **faas** : function as a service 


- **IAAS** : these services provide set of computing resoures such a storage , network,  processor that are provided virtually y cloud provider so that user can access and configure according to their uses . In this user rents infrastructure and pay for the services based on their hourly weekly monthly uses. It also provides  Os , servers and database  ex - ec2 , google compute engine and digital ocean .

 - benefits : beinfits of infrastructer as services are  : user can modify the architectrue as per their requirements and user have full control of computing resoruces  an user dont need to worry about  maintainace . ex- openstack , rack space, IBM , Vmware.



- **PAAS** :  this provides platform where developer can develope , test and manage their application .

	- This services provide on demand environment for developing any software application .
	- This serviecs are hosted on cloud and users can access these services through browse's.
	- This service provider host hardware and software on their own infrastructure .
	- example - windows azure , google app engine , open swift .
	- benefits : as the service provider provides platform (hardware ,software) the dev only have to access the service and create an application.
	         	- It is easier to deploy any application .

	- difficulty - It is difficult to migrate from one service provider to other .

- **SAAS** : 

	- This provides user comlete application over the internet .
	- All the infrastructre tools are located at data cnters and managed by service provider .
	- User dont have to isntall any software they only have to use it .
	- examples : gmail , drive , power bi .
	- vendors: google apple  azure  
	- Saas is divided into two parts : 

		1. simple multi Latency : this means each user wil have independant resources which is different from other users.

		2. fine grain multi latency: This means each user will get shared resources where resources are shared among multiple users .

				- advantages : 
				 - easire to access  application software 



## Types of cloud 

- cloud is further divided into 4 parts 

1. public : 

- resources are open to all and cloud infrastructure are made available to general public.

- example of these are ec2 google app 

- Example : easier to scale up and scale down as per demand 

- Disadvantages :  1. as it is public security breach can happen 

		   2. it is not 100% customize according to user .

- key pointers : These resoruces are owned by 3rd party .


2. **private** 

- they are operated and owned by a single organization .

- THis is further divided into two parts . 
	- onpremises 
	- outsourced cloud 

benifit : 
- high securtiy as authorized users can only access 
- As it is owned by signle organization it has full control over the resources.

- disadvantage : only skilled person can manage this cloud . Scaling up and down is difficult .


- **hybbrid** 

- this kind of cloud is combination of public and private cloud . This allows the users to share the data between them .

- These kind of cloud are partially secured as one of the cloud is public .

- These kind of cloud is the combination of one public one private  , 2 or more private clouds , two or more public .  

- The workload between 2 cloud can be managed effectively . 

- performance of hybrid cloud is depends on deployent and management of its cloud .

- The link between private and pulic is done by vpn/lan

- advantages : As it is comination of public and private cloud it is easier to scale up and down .

- Disadvantage : It is difficult to combine cloud Network .

- Example : dedicated connection with google cloud .  directly conneced by aws , express cloud via azure

-**community cloud** : These kind of system or services are accessible by several groups  of several organization/ users to share information between them .

- It is  owned / managed mainly by organizations .Infrastructure  is shared between users and organization .




- advantages :
	- maintenance 
	- less expensive than private cloud 

- disadvantages:
	- it is difficult to distribute the responsibility among organizations.






1. defining a purpose : 

- 


2. defining the hardware :

- you need to choose compute services  that provides you right support to scale up and scale down  as per the requirement 

- examples are ec2 , lambda elastic container 

3. define the storage  :

-  you need to choose compute services  that provides you right support right  computer servcies  that wwill suppport you to store dat where you can create backups over the internet .

4. defining the network :

-  It delivers data with low network latency and high network performance .

- examples bsc virtual private cloud , route 53 ,direct connection .

5. defining  security : 

-  we define security for authentecation of user .

- example - iam identity and access management 

6. defining the management process and tools :

-  You can have full control over cloud management by defining the over cloud 

-

- example :  

- autoscaling continuously  monitorys and checks 


## virtualisation 

- virtualisation  is a concept to create virtual systems  which uses  post machine storage process resources  like cpu .

- a single machine can have multiple os running virtually because of this layer .



### hypervisor 

- IT is a form of virtual software which is used to  allocate resources. 

- It is a hardware virtualisation technique , that allows you to have multiple os running on a single host machine .

i- It is also called as vm manager . 


1. type 1 : this type of hypervisor runs directly on the host machine hardware where it has the direct access to hardware resources . 

- this type of hypervisor doesnot need any server based os .

- example :  VMware ESXi, Citrix XenServer

2. type 2 : Host os run on host system . these kind of hypervisor needs host os  or application on the host machine .

- examples - vmware workstation , oracle workbox  , 



