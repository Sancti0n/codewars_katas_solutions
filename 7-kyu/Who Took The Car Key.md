https://www.codewars.com/kata/57a23c2acf1fa514d0001034

## JavaScript
```js
function whoTookTheCarKey(message) {
  let w = "";
  for (let i=0;i<message.length;i++) {
    w += String.fromCharCode(parseInt(message[i], 2));
  }
  return w
}
```

## Python
```python
def who_took_the_car_key(message):
    w = ""
    for i in message:
        w += chr(int(i,2))
    return w
```