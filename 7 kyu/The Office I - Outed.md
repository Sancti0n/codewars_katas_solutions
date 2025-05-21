https://www.codewars.com/kata/57ecf6efc7fe13eb070000e1

## Python
```python
def outed(meet, boss):
    c = 0
    for i in meet:
        if i == boss: c += meet[i]*2
        else: c += meet[i]
    if c/len(meet) <= 5: return "Get Out Now!"
    return "Nice Work Champ!"
```

## JavaScript
```js
function outed(meet, boss) {
    let c = 0;
    for (let i = 0; i < Object.keys(meet).length; i++) {
        if (Object.keys(meet)[i] == boss) c += Object.values(meet)[i] * 2;
        else c += Object.values(meet)[i];
    }
    if (c/Object.keys(meet).length <= 5) return "Get Out Now!"
    return "Nice Work Champ!"
}
```