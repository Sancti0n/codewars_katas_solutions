https://www.codewars.com/kata/56fe97b3cc08ca00e4000dc9

## JavaScript
```js
function sc(apple) {
  for (let i=0;i<apple.length;i++) {
    if (apple[i].indexOf("B")>-1) return [i, apple[i].indexOf("B")]
  }
}
```

## Python
```py
def sc(apple):
    for i in range(len(apple)):
        if "B" in apple[i]:
            return (i, apple[i].index("B"))
```