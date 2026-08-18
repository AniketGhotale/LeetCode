# Write your MySQL query statement below
SELECT actor_id, director_id FROM ActorDirector Group By actor_id,director_id HAVING COUNT(*) >= 3;