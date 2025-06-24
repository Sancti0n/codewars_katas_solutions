https://www.codewars.com/kata/61123a6f2446320021db987d

## Python
```python
def prev_mult_of_three(n):
    n = str(n)
    while len(n)>0:
        if (int(n)/3).is_integer(): return int(n)
        n = n[:-1]
    return None
```

## JavaScript
```js
const prevMultOfThree = n => {
  let w = n.toString()
  while (w.length>0)
    if (Number.isInteger(Number(w)/3)) return Number(w)
    else w = w.slice(0, -1)
    return null
}
```

## Java
```java
public class Kata {
  public static Integer prevMultOfThree(int n){
    String nb = String.valueOf(n);
    while (nb.length()>0) {
      if (Integer.parseInt(nb)/3 == Double.parseDouble(nb)/3) return Integer.parseInt(nb);
      nb = nb.substring(0,nb.length()-1);
    }
    return null;
  }
}
```