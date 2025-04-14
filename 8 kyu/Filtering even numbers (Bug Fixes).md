https://www.codewars.com/kata/566dc566f6ea9a14b500007b

## Python
```python
def kata_13_december(lst):
    t = []
    for i in range(len(lst)): 
        if lst[i]%2==1: t.append(lst[i])
    return t
```

## Java
```java
import java.util.List;

public class Kata13December {
  public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
    listOfNumbers.removeIf(n -> n % 2 == 0);
    return listOfNumbers;
  }
}
```