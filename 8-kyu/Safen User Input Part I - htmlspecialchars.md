https://www.codewars.com/kata/56bcaedfcf6b7f2125001118

## Python
```python
def html_special_chars(data): 
    data = list(data)
    for i in range(len(data)):
        if data[i] == "<": data[i] = "&lt;"
        elif data[i] == ">": data[i] = "&gt;"
        elif data[i] == "\"": data[i] = "&quot;"
        elif data[i] == "&": data[i] = "&amp;"
    return "".join(data)
```

## JavaScript
```js
function htmlspecialchars(data) {
  data = data.split("");
  for (let i=0;i<data.length;i++) {
    if (data[i] == "<") data[i] = "&lt;";
    else if (data[i] == ">") data[i] = "&gt;";
    else if (data[i] == "\"") data[i] = "&quot;";
    else if (data[i] == "&") data[i] = "&amp;";
  }
  return data.join("")
}
```