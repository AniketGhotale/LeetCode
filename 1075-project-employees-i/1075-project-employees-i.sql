# Write your MySQL query statement below
-- SELECT project_id, AVG(SELECT experience_years FROM Employee e JOIN Project p ON e.employee_id = p.employee_id AS temp) FROM Project p JOIN Employee e ON p.employee_id = e.employee_id;

SElECT project_id, round(average_years,2) AS average_years FROM (SELECT project_id, AVG(experience_years) AS average_years FROM Employee e JOIN Project p ON e.employee_id = p.employee_id GROUP BY project_id) AS temp;