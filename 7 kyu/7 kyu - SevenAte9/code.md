Write a function that removes every lone 9 that is inbetween 7s.

## JavaScript
```js
function sevenAte9(str){
    str = str.split('')
    for (let i=0;i<str.length;i++) {
        if (str[i] == '9') {
            if (i!=0 && i!=str.length-1) {
                if (str[i-1] == '7' && str[i+1] == '7') {
                    str.splice(i,1)
                }
            }
        }
    }
    return str.join('')
}
```

## Python
```python
def seven_ate9(s):
    v = s[0]
    for i in range(1, len(s)-1):
        if s[i] != "9" or s[i-1] != "7" or s[i+1] != "7": v += s[i]
    return v+s[len(s)-1]
```