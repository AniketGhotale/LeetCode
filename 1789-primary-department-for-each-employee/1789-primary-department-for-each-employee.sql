# Write your MySQL query statement below
-- SELECT DISTINCT employee_id, department_id FROM Employee WHERE employee_id IN (SELECT employee_id FROM Employee WHERE primary_flag = 'Y');

SELECT employee_id, department_id FROM Employee Group By employee_id Having COUNT(employee_id) = 1 UNION select employee_id, department_id from Employee Where primary_flag = 'Y';