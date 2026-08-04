# Write your MySQL query statement below
SELECT MAX(SALARY) AS SecondHighestSalary FROM Employee WHERE Salary < (SELECT max(Salary) FROM Employee);