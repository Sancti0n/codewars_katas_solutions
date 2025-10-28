https://www.codewars.com/kata/529eef7a9194e0cbc1000255

## Python
```python
def is_anagram(test, original):
    return sorted(test.lower()) == sorted(original.lower())
```

## JavaScript
```js
var isAnagram = function(test, original) {
  return test.toLowerCase().split("").sort().join("") == original.toLowerCase().split("").sort().join("")
};
```