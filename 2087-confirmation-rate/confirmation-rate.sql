-- Write your PostgreSQL query statement below
SELECT Signups.user_id, 
CASE WHEN 
    COUNT(Confirmations.user_id) > 0 
    THEN ROUND(CAST(SUM(
        CASE WHEN Confirmations.action = 'confirmed' THEN 1 ELSE 0 END
    ) AS decimal) / COUNT(Confirmations.user_id), 2) ELSE 0 
END AS confirmation_rate
FROM Signups
LEFT JOIN Confirmations ON Signups.user_id = Confirmations.user_id
GROUP BY Signups.user_id