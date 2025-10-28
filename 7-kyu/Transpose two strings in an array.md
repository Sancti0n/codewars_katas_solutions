https://www.codewars.com/kata/581f4ac139dc423f04000b99

## JavaScript
```js
function transposeTwoStrings (array) {
  let w = "";
  let l = Math.max(array[0].length, array[1].length);
  while (l>=array[0].length || l>=array[1].length) {
    if (l>=array[0].length) array[0] += " ";
    else array[1] += " ";
  }
  for (let i=0;i<l;i++) {
    if (i+1==l) w += array[0][i] + " " + array[1][i];
    else w += array[0][i] + " " + array[1][i] + "\n";
  }
	return w
}
```

## Python
```python
def transpose_two_strings(arr):
    w = ""
    l = max(len(arr[0]), len(arr[1]))
    while l>=len(arr[0]) or l>=len(arr[1]):
        if l>=len(arr[0]): arr[0] += " "
        else: arr[1] += " "
    for i in range(l):
        if (i+1==l): w += arr[0][i] + " " + arr[1][i]
        else: w += arr[0][i] + " " + arr[1][i] + "\n"
    return w
```