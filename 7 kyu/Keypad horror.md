https://www.codewars.com/kata/5572392fee5b0180480001ae

## Python
```python
def computer_to_phone(numbers):
    d = {"9":"3","8":"2","7":"1","1":"7","2":"8","3":"9"}
    w = ""
    for i in numbers:
        if i in d: w += d[i]
        else: w += i
    return w
```

## JavaScript
```js
function computerToPhone(numbers){
  let d = {"9":"3","8":"2","7":"1","1":"7","2":"8","3":"9"};
  let w = "";
  for (let i=0;i<numbers.length;i++) {
    if (numbers[i] in d) w += d[numbers[i]];
    else w += numbers[i];
  }
  return w
}
```