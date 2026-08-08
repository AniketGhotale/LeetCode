# Write your MySQL query statement below
SELECT sell_date, Count(distinct product) as num_sold, Group_concat(distinct product) as products from Activities Group By sell_date;