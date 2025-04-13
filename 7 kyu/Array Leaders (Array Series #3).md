An element is leader if it is greater than The Sum all the elements to its right side.

```
arrayLeaders ({1, 2, 3, 4, 0}) ==> return {4}
```
4 is greater than the sum all the elements to its right side
```
arrayLeaders ({16, 17, 4, 3, 5, 2}) ==> return {17, 5, 2}
```
17 is greater than the sum all the elements to its right side, 5 is greater than the sum all the elements to its right side, the last element 2 is greater than the sum of its right elements (abstract zero)


## JavaScript
```js
function sum(arr) {
  return arr.reduce((p, c) => p + c, 0)
}

function arrayLeaders(numbers){
  let t = [];
  for (let i=0;i<numbers.length;i++) {
    if (sum(numbers.slice(i+1))<numbers[i]) t.push(numbers[i]);
  }
  return t
}
```

## Python
```python
def array_leaders(numbers):
    t = []
    for i in range(len(numbers)):
        if sum(numbers[i+1:])<numbers[i]: t.append(numbers[i])
    return t
```

## PHP
```php
function arrayLeaders($numbers) {
  $t = [];
  for ($i=0;$i<count($numbers);$i++) {
    if (array_sum(array_slice($numbers, $i+1))<$numbers[$i]) {
      $t[] = $numbers[$i];
    }
  }
  return $t;
}
```