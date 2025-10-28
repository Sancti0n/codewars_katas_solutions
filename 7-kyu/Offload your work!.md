https://www.codewars.com/kata/5b3e1dca3da310a4390000f3

## JavaScript
```js
function workNeeded(projectMinutes, freelancers) {
  let s = 0;
  for (let i=0;i<freelancers.length;i++) {
    s += freelancers[i][0]*60 + freelancers[i][1];
  }
  s = projectMinutes - s
  return s <= 0 ? "Easy Money!": "I need to work " + parseInt(s/60) + " hour(s) and " + s%60 + " minute(s)"
}
```

## Python
```python
def work_needed(project_minutes, free_lancers):
    s = 0
    for i in range(len(free_lancers)):
        s += free_lancers[i][0]*60 + free_lancers[i][1]
    s = project_minutes - s
    return "Easy Money!" if s <= 0 else "I need to work " + str(s//60) + " hour(s) and " + str(s%60) + " minute(s)"
```

## PHP
```php
function workNeeded($projectMinutes, $freelancers) {
  $s = 0;
  for ($i=0;$i<count($freelancers);$i++) {
    $s += $freelancers[$i][0]*60 + $freelancers[$i][1];
  }
  $s = $projectMinutes - $s;
  return $s <= 0 ? "Easy Money!": "I need to work " . strval(floor($s/60)) . " hour(s) and " . strval($s%60) . " minute(s)";
}
```