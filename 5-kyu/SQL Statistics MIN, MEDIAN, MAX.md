https://www.codewars.com/kata/58167fa1f544130dcf000317

## SQL
```sql
SELECT 
  min(score) as min,
  percentile_cont(0.5) within group(order by score desc) as median,
  max(score) as max
FROM result
```