SELECT name 
FROM Employee
Where id IN (SELECT managerId
            FROM Employee
            GROUP BY managerID
            HAVING COUNT(managerID) >= 5
            )

