https://www.codewars.com/kata/5703c093022cd1aae90012c9

## JavaScript
```js
function find(a,e) {
  return a.indexOf(e)>-1?a.indexOf(e):"Not found"
}
```

## Python
```python
def find(arr, e):
    return arr.index(e) if e in arr else "Not found" 
```

## Java
```java
public class Solution{public static String kata(String[]a,String s){for (int i=0;i<a.length;i++)if(a[i].equals(s))return String.valueOf(i);return "Not found";}}
```