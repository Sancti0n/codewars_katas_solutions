https://www.codewars.com/kata/54dc6f5a224c26032800005c

## Python
```python
def stock_list(stocklist, categories):
    if not stocklist: return ''
    t = [0]*len(categories)
    for i in stocklist:
        if i[0] in categories:
            t[categories.index(i[0])] += int(i.split(" ")[1])
    s = ""
    for j in range(len(t)):
        s += "("+categories[j]+" : "+str(t[j])+") - "
    return s[:-3]
```

## JavaScript
```js
function stockList(books, categories) {
  if (!books.length) return ''
  let t = Array(categories.length).fill(0);
  for (let i=0;i<books.length;i++) {
    if (categories.indexOf(books[i][0])>-1) t[categories.indexOf(books[i][0])] += parseInt(books[i].split(" ")[1]);
  }
  let s = "";
  for (let j=0;j<t.length;j++) {
    s += "("+categories[j]+" : "+t[j].toString()+") - ";
  }
  return s.substring(0, s.length-3)
}
```