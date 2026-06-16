https://www.codewars.com/kata/580fe518cefeff16d00000c0

## SQL
```sql
CREATE OR REPLACE FUNCTION increment(age integer) 
RETURNS integer AS $$
    SELECT age + 1;
$$ LANGUAGE sql;
```