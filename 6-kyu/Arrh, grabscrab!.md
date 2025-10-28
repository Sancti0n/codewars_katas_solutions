https://www.codewars.com/kata/52b305bec65ea40fe90007a7

## Python
```python
def grabscrab(word, possible_words):
    t = []
    word = "".join(sorted(word))
    for i in possible_words:
        if word == "".join(sorted(i)): t.append(i)
    return t
```

## JavaScript
```js
function grabscrab(anagram, d) {
  let t = [], s = "";
  anagram = anagram.split("").sort().join("");
  for (let i=0;i<d.length;i++) {
    s = d[i].split("").sort().join("");
    if (anagram == s) t.push(d[i]);
  }
  return t
}
```

## TypeScript
```ts
export function grabscrab(anagram: string, d: string[]): string[] {
  let t = [], s = "";
  anagram = anagram.split("").sort().join("");
  for (let i=0;i<d.length;i++) {
    s = d[i].split("").sort().join("");
    if (anagram == s) t.push(d[i]);
  }
  return t
}
```