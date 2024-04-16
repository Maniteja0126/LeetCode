-- Write your PostgreSQL query statement below
Select e.name, b.bonus
From employee As e
Left Join bonus As b
On b.empId = e.empId
Where b.bonus < 1000 Or b.bonus Is null;