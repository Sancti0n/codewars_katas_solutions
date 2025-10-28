https://www.codewars.com/kata/57d4e99bec16701a67000033

## JavaScript
```js
function heavyMetalUmlauts(boringText) {
  let t = {"A":"Ä","E":"Ë","I":"Ï","O":"Ö","U":"Ü","Y":"Ÿ","a":"ä","e":"ë","i":"ï","o":"ö","u":"ü","y":"ÿ"};
  let T = boringText.split("");
  for (let i=0;i<T.length;i++) {
    if (Object.keys(t).indexOf(T[i]) > -1) {
      T[i] = t[T[i]];
    }
  }
  return T.join("")
}
```

## Python
```python
def heavy_metal_umlauts(boring_text):
    t = {"A":"Ä","E":"Ë","I":"Ï","O":"Ö","U":"Ü","Y":"Ÿ","a":"ä","e":"ë","i":"ï","o":"ö","u":"ü","y":"ÿ"}
    T = list(boring_text)
    for i in range(len(T)):
        if T[i] in t:
            T[i] = t[T[i]]
    return "".join(T)
```