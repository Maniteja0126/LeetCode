# Write your MySQL query statement below
Select unique_id,name From employees as emp left join employeeUNI as uni on uni.id = emp.id;