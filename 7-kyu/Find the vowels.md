https://www.codewars.com/kata/5680781b6b7c2be860000036

## Python
```python
def vowel_indices(word):
    t = []
    for i in range(len(word)):
        if word[i].lower() in ['a','e','i','o','u','y']: t.append(i+1)
    return t
```

## JavaScript
```js
function vowelIndices(word){
    let w = word.toLowerCase()
    let t = []
    let v = ['a','e','i','o','u','y']
    for (let i=0;i<w.length;i++) {
        if (v.includes(w[i])) t.push(i+1)
    }
    return t
}
```