https://www.codewars.com/kata/5602e85d255e3240c2000024

## Python
```python
def what_note(string, fret):
    t = ["A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G","G#"]
    return t[(t.index(string.upper())+fret)%12]
```

## JavaScript
```js
const whatNote = (string, fret) => {
  let t = ["A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G","G#"];
  return t[(t.indexOf(string.toUpperCase())+fret)%12]
};
```