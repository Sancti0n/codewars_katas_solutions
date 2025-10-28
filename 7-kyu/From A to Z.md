https://www.codewars.com/kata/6512b3775bf8500baea77663

## Python
```python
import string

def gimme_the_letters(sp):
    if sp[0].islower(): l = string.ascii_lowercase
    else: l = string.ascii_uppercase
    w = sp[0]+l.split(sp[0])[1]
    w = w.split(sp[2])[0]+sp[2]
    return w
```

## Java
```java
public class Solution{
  public static String gimmeTheLetters(String s){
    String w = "";
    for (char c = s.charAt(0); c <= s.charAt(2); c++) w += c;
    return w;
  }
}
```