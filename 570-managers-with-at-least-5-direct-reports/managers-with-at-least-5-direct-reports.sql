-- Write your PostgreSQL query statement below
select a.name from Employee a , Employee b
where a.id = b.managerId
group by a.name , a.id having count(*) >= 5;