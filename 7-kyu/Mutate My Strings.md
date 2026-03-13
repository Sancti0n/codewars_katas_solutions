https://www.codewars.com/kata/59bc0059bf10a498a6000025

## JavaScript
```js
function mutateMyStrings(stringOne, stringTwo) {
  let i = 0, j = stringOne.length, s = stringOne;
  while (i<j) {
    if (s[i] != stringTwo[i]) {
      stringOne += "\n" + stringTwo.slice(0, i+1) + stringOne.slice(i+1, j);
    }
    i++;
  }
  return stringOne + "\n"
}
```

## Python
```py
def mutate_my_strings(s1,s2):
    i, j, s = 0, len(s1), s1
    while i<j:
        if s[i] != s2[i]:
            s1 += "\n" + s2[:i+1] + s1[i+1:j]
        i += 1
    return s1 + "\n"
```