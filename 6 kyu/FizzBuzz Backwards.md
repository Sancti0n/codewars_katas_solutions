https://www.codewars.com/kata/59ad13d5589d2a1d84000020

## Python
```py
def reverse_fizz_buzz(arr):
    a, b = [0, 0]
    for i in range(len(arr)):
        if arr[i] == "Fizz":
            if a == 0: a = i + 1
        elif arr[i] == "Buzz":
            if b == 0: b = i + 1
        elif arr[i] == "FizzBuzz":
            if a == 0: a = i + 1
            if b == 0: b = i + 1
    return (a,b)
```

## JavaScript
```js
function reverseFizzBuzz(arr) {
  let a = 0, b = 0;
  for (let i=0;i<arr.length;i++) {
    if (arr[i] == "Fizz") {
      if (a == 0) a = i + 1;
    }
    else if (arr[i] == "Buzz") {
      if (b == 0) b = i + 1;
    }
    else if (arr[i] == "FizzBuzz") {
      if (a == 0) a = i + 1;
      if (b == 0) b = i + 1;
    }       
  }
  return [a,b]
}
```