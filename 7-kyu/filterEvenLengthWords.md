https://www.codewars.com/kata/59564f3bcc15b5591a00004a

## JavaScript
```js
function filterEvenLengthWords(words) {
  return words.filter(e => e.length%2 == 0)
}
```

## Python
```python
def filter_even_length_words(words):
    return [i for i in words if len(i)%2 == 0]
```