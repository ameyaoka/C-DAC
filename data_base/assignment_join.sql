

use hr;

# write a query to find the addresses (location_id, street_address, city, state_province, country_name) of all the departments. 
 select d.department_id, d.department_name ,l.street_address,l.city ,l.state_province , c.country_name   from departments  d  join locations l  on   d.location_id = l.location_id  join country_new c on l.country_id = c.country_id ;


#write a query to find the name (first_name, last name), department id and name of all the employees.


 select e.first_name , e.last_name , d.department_id ,  d.department_name  from employees e  join departments d on e.department_id = d.department_id;


# write a query to find the name (first_name, last_name), job, department id and name of the employees who works in london.
 select e.first_name , e.last_name , d.department_id , d.department_name , j.job_title from employees e  join departments d on  e.department_id = d.department_id  join jobs j on e.job_id = j.job_id  join locations l on l.location_id = d.location_id where l.city = 'london';


#write a query to find the employee id, name (last_name) along with their manager_id and name (last_name).


# write a query to find the name (first_name, last_name) and hire date of the employees who was hired after 'jones'. 
select first_name, last_name, hire_date
from employees
where hire_date > (select hire_date from employees where last_name = 'jones');


#  write a query to get the department name and number of employees in the department. 

select d.department_name, count(e.employee_id) as num_employees
from departments d
left join employees e on d.department_id = e.department_id
group by d.department_name;


# 7. write a query to find the emp

# write a query to display the department id and name and first name of manager. 

select d.department_id, d.department_name, e.first_name as manager_first_name
from departments d
join employees e on d.manager_id = e.employee_id;


# write a query to display the department name, manager name, and city.

select d.department_name, concat(e.first_name, ' ', e.last_name) as manager_name, l.city
from departments d
join employees e on d.manager_id = e.employee_id
join locations l on d.location_id = l.location_id;

# write a query to display the job title and average salary of employees.
select e.job_id,j.job_title ,avg(e.salary) as average_salary from employees e  join jobs j on e.job_id = j.job_id group by e.job_id;
