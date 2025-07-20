https://www.codewars.com/kata/570597e258b58f6edc00230d

## Python
```python
def array(string):
    if len(string)<5: return None
    s = string.split(",")
    if len(s)<3: return None
    return " ".join(s[1:len(s)-1])
```

## JavaScript
```js
function array(arr){
  if (arr.length<5) return null
  let s = arr.split(",");
  if (s.length<3) return null
  return s.slice(1, s.length-1).join(" ")
}
```