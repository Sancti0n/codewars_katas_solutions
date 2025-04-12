 A noob programmer was given two simple tasks: sum and sort the elements of the given array arr = [a1, a2, ..., an].

He started with summing and did it easily, but decided to store the sum he found in some random position of the original array which was a bad idea. Now he needs to cope with the second task, sorting the original array arr, and it's giving him trouble since he modified it.

Given the array shuffled, consisting of elements a1, a2, ..., an, and their sumvalue in random order, return the sorted array of original elements a1, a2, ..., an.
Example

For shuffled = [1, 12, 3, 6, 2], the output should be [1, 2, 3, 6].

1 + 3 + 6 + 2 = 12, which means that 1, 3, 6 and 2 are original elements of the array.

For shuffled = [1, -3, -5, 7, 2], the output should be [-5, -3, 2, 7].

## Python
```python
def shuffled_array(s):
    for i in range(len(s)):
        if s[i] == sum(s[:i]+s[i+1:]):
            s.remove(s[i])
            s.sort(reverse=False)
            return s
```

## JavaScript
```js
function shuffledArray(arr) {
  let s = arr.reduce((p, c) => p + c, 0);
  let i = arr.indexOf(s/2);
  arr.splice(i, 1);
  return arr.sort((a,b)=>a-b)
}
```