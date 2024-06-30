-- Write your PostgreSQL query statement below
select contest_id,
round(count( distinct user_id) * 100 / (select count(user_id)
from Users) :: dec,2) percentage
from Register
group by contest_id
order by percentage desc,contest_id;