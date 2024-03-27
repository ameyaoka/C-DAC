# lecture  

# sql functions 


delimiter $$

create function getempfullname(f_name varchar(30) )
returns varchar(30)
deterministic
begin 
	declare full_name varchar(60);
	select concat(first_name , '' , last_name) into full_name   from employees 
	where first-name = f_name ;
	return full_name ;
end;
$$

delimiter ;
select  getempfullname('sam');

# find year of exp by their emp-id 



delimiter $$ 

create function fetch_exp( id int)
returns int 
deterministic 
begin 
	declare year_of_exp int ;
    select timestampdiff(year,hire_date ,curdate()) into year_of_exp from employees 
    where employee_id = id ;
    return year_of_exp ;
    
end ; 
$$
delimiter ; 
select fetch_exp(10);
;





drop function  fetch_exp ;



# write a function to retrive info af an employee hired after 1st jan 1995

delimiter $$ 

create function fetch_hire_date ( id int) 
returns date 
deterministic 


begin 
	declare  count_emp int ;
    select count(*) into count_emp from employees
    where HIRE_DATE > hire_date ;
    return count_emp;
    
end; 

$$
delimiter ; 
select fetch_exp();
;



delimiter $$ 
create function getIncrementSal ( emp_id  int, increment_sal m decimal(10,2) )
returns decimal(10,2)
deterministic 


begin 
	declare  sal decimal (10,2);
    declare incre_sal decimal(10,2);
    select sal into sal from mployees where employee_id = emp_id;
    set incre_sal = sal+increment_sal ;
    where 
    return count_emp;
    
end; 

$$
delimiter ; 
select fetch_exp();
;


# find employees names by its department name 






use hr ;
# calculate the number of departments in particular locatin id

delimiter $$ 
create function count_loc ( loc_id  int )
returns int 
deterministic 

begin 
	declare  number_of_dept int ;
    select count( department_name) into number_of_dept from departments where location_id = loc_id ;
    return number_of_dept ;
end; 

$$
delimiter ; 

select count_loc(1700) ;







delimiter $$ 
create function dept_sal ( dept_id  int )
returns int 
deterministic 

begin 
	declare  sum_sal int ;
	select sum(salary) into sum_sal from employees where department_id= dept_id ;
	return sum_sal ;
end; 

$$
delimiter ; 

select dept_sal (1700) ;




#########################################################3

delimiter $$ 
create function avg_sal  ( job_t  varchar(50) )
returns int 
deterministic 

begin 
	declare  val int ;
    select avg(salary) from employees e join jobs j on j.job_id = e.job_id where job_title = job_t;
    return val  ;
end; 

$$
delimiter ; 

select avg_sal('programmer');


 ############ 
 
 delimiter $$ 
create function num_emp ( dept_name  varchar(50) )
returns int 
deterministic 

begin 
	declare  val int ;
	select count(employee_id) into val  from employees e join departments d on d.department_id = e.department_id where department_name = dept_name;
    return val  ;
end; 

$$
delimiter ; 

select num_emp('programmer');






 
