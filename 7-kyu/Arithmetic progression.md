https://www.codewars.com/kata/55caf1fd8063ddfa8e000018

## Python
```python
def arithmetic_sequence_elements(a, d, n):
    i = 0
    w = ''
    while i<n:
        if (i+1 == n): w += str(a)
        else:
            w += str(a)+", "
            a += d
        i += 1
    return w
```

## JavaScript
```js
function arithmeticSequenceElements(a, d, n) {
  let i = 0;
  let w = "";
  while (i<n) {
    if (i+1 == n) w += a.toString();
    else {
      w += a.toString()+", ";
      a += d;
    }
    i++;
  }
	return w
}
```