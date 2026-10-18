https://www.codewars.com/kata/563c13853b07a8f17c000022

## Python
```py
def is_today(date):
    return True if date.year == date.now().year and date.month == date.now().month and date.day == date.now().day else False
```

## JavaScript
```js
function isToday(date) {
  let a = new Date();
  return date.getFullYear() == a.getFullYear() && date.getMonth() == a.getMonth() && date.getDate() == a.getDate() ? true : false;
}
```