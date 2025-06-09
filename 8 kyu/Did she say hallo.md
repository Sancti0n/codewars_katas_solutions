https://www.codewars.com/kata/56a4addbfd4a55694100001f

## Python
```python
def validate_hello(greetings):
    t = ["hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"]
    s = greetings.lower()
    for i in t:
        if i in s: return True
    return False
```

## JavaScript
```js
function validateHello(greetings) {
  let t = ["hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"];
  let s = greetings.toLowerCase();
  for (let i=0;i<t.length;i++) {
    if (s.indexOf(t[i])>-1) return true
  }
  return false
}
```