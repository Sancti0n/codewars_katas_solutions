https://www.codewars.com/kata/565b9d6f8139573819000056

## Python
```python
import string

def decode(message):
    l = list(string.ascii_lowercase)
    s = ""
    for i in message:
        if i in l: s += l[25-l.index(i)]
        else: s += i
    return s
```

## JavaScript
```js
function decode(message) {
    let l = String.fromCharCode(...Array(123).keys()).slice(97).split("");
    let s = "";
    for (let i=0;i<message.length;i++) {
        if (l.indexOf(message[i])>-1) s += l[25-l.indexOf(message[i])];
        else s += message[i];
    }
    return s
}
```