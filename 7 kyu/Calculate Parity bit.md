https://www.codewars.com/kata/5df261342964c80028345a0a

## Python
```python
def check_parity(parity, bin_str):
    return bin_str.count('1')%2 if parity == 'even' else (bin_str.count('1')%2 + 1)%2
```

## JavaScript
```js
function checkParity(parity, bin){
  return parity == "even" ? (bin.match(new RegExp("1", "g")) || []).length%2: ((bin.match(new RegExp("1", "g")) || []).length%2 + 1)%2
}
```