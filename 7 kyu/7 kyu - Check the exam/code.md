The first input array is the key to the correct answers to an exam, like ["a", "a", "b", "d"]. The second one contains a student's submitted answers.

The two arrays are not empty and are the same length. Return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer, represented as an empty string (in C the space character is used).

If the score < 0, return 0.


## JavaScript
```js
function checkExam(arr1, arr2) {
  let s = 0;
  for (let i=0;i<arr1.length;i++) {
    if (arr1[i] == arr2[i]) s += 4;
    if (arr2[i] == "") s += 0
    else if (arr1[i] != arr2[i]) s -= 1;
  }
  if (s<0) return 0
  return s
}
```

## Python
```python
def check_exam(arr1,arr2):
    s = 0
    for i in range(len(arr1)):
        if arr1[i] == arr2[i]: s += 4
        elif arr1[i] != arr2[i] and arr2[i] != "": s -= 1
    return s if s>=0 else 0
```

## PHP
```php
function checkExam(array $array1, array $array2): int{
  $s = 0;
  for ($i=0;$i<count($array1);$i++) {
    if ($array1[$i] == $array2[$i]) $s += 4;
    if ($array2[$i] == "") $s += 0;
    else if ($array1[$i] != $array2[$i]) $s -= 1;
  }
  return $s>=0 ? $s: 0;
}
```