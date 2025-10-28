https://www.codewars.com/kata/57f222ce69e09c3630000212

## Python
```python
def well(x):
    if x.count("good")==0: return "Fail!"
    if x.count("good")==1 or x.count("good")==2: return "Publish!"
    return "I smell a series!"
```

## JavaScript
```js
function well(x){
  if (x.filter(elt => elt === "good").length == 0) return "Fail!"
  if (x.filter(elt => elt === "good").length == 1 || x.filter(elt => elt === "good").length == 2) return "Publish!"
  return "I smell a series!"
}
```

## Java
```java
public class Kata {
  public static String well(String[] x) {
    int count = 0;
    for (int i=0;i<x.length;i++) if (x[i] == "good") count++;
    if (count == 0) return "Fail!";
    if (count == 1 || count == 2) return "Publish!";
    return "I smell a series!";
  }
}
```