https://www.codewars.com/kata/5c563cb78dac1951c2d60f01

## Python
```python
import string

def pass_the_door_man(word):
    t = list(string.ascii_lowercase)
    s = 0
    for i in range(len(word)-1):
        if word[i] == word[i+1]: s += (t.index(word[i])+1)*3
    return s
```

## JavaScript
```js
function passTheDoorMan(word) {
  let t = String.fromCharCode(...Array(123).keys()).slice(97).split("");
  let s = 0;
  for (let i=0;i<word.length;i++) {
    if (word[i] == word[i+1]) s += (t.indexOf(word[i])+1)*3;
  }
  return s
}
```