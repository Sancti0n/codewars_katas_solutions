https://www.codewars.com/kata/582dafb611d576b745000b74

## Python
```python
def quote(fighter):
    if 'conor' in fighter.lower(): return "I'd like to take this chance to apologize.. To absolutely NOBODY!"
    return "I am not impressed by your performance."
```

## JavaScript
```js
var quote = function(fighter) {
  if (fighter.toLowerCase().split(" ").indexOf('conor') > -1) return "I'd like to take this chance to apologize.. To absolutely NOBODY!"
  return "I am not impressed by your performance."
};
```