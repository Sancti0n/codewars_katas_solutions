https://www.codewars.com/kata/54da5a58ea159efa38000836

## PHP
```php
function findIt(array $seq) : int {
  $d = [];
  for ($i=0;$i<count($seq);$i++) {
    if (in_array($d[$seq[$i]], $d)) $d[$seq[$i]]++;
    else $d[$seq[$i]] = 1;
  }
  foreach ($d as $key => $value) {
    if ($value%2 == 1) return $key;
  }
}
```

## JavaScript
```js
function findOdd(A) {
   let d = {};
   for (let i=0;i<A.length;i++) {
     d[A[i]] ? d[A[i]] += 1 : d[A[i]] = 1
   }
   for (let [key, value] of Object.entries(d)) {
      if (value%2 === 1) return parseInt(key)
   }
}
```

## Java
```java
public class FindOdd {
  public static int countInt(int[] a, int b) {
    int c = 0;
    for (int i=0;i<a.length;i++) {
      if (a[i] == b) c++;
    }
    return c;
  }
  
	public static int findIt(int[] a) {
  	for (int i=0;i<a.length;i++) {
      if (countInt(a, a[i])%2 == 1) return a[i];
    }
    return 0;
  }
}
```

## Python
```python
def find_it(seq):
    d = {}
    for i in seq:
        if i in d: d[i] += 1
        else: d[i] = 1
    for i in d:
        if d[i]%2 == 1:
            return i
```