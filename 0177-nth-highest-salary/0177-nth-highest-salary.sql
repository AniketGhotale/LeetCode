CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      SELECT MIN(salary) From ( SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) AS rk FROM Employee) AS res WHERE rk = N

  );
END