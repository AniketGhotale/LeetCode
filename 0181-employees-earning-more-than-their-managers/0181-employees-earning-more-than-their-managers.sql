# Write your MySQL query statement below
-- SELECT name AS Employee FROM Employee WHERE salary > ALL (SELECT salary FROM Employee WHERE managerId in (SELECT managerId FROM Employee Where name = name));
SELECT e.name AS Employee FROM Employee e  WHERE e.salary > (SELECT e2.salary FROM Employee e2 WHERE e2.id = e.managerId);