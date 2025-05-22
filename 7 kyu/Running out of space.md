https://www.codewars.com/kata/56576f82ab83ee8268000059

## Python
```python
def spacey(array):
    t = []
    for i in range(0,len(array)):
        if i == 0: t.append(array[0])
        else: t.append("".join(array[0:i+1]))
    return t
```

## JavaScript
```js
function spacey(array){
  let t = [];
  for (let i=0;i<array.length;i++) {
    if (i==0) t.push(array[0]);
    else t.push(array.slice(0, i+1).join(""));
  }
  return t
}
```

## Java
```java
public class OutOfSpace {
  public static String[] spacey(String[] array) {
    String w = "";
    for (int i=0;i<array.length;i++) {
      if (i == 0) w = array[i];
      else {
        array[i] = w + array[i];
        w = array[i];
      }
    }
    return array;
  }
}
```