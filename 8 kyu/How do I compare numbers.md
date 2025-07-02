https://www.codewars.com/kata/55d8618adfda93c89600012e

## Python
```python
def what_is(x):
    if x is 42: return 'everything'
    elif x == 42 * 42: return 'everything squared'
    return 'nothing'
```

## Java
```java
public class HowDoICompare {
  public static String whatIs(Integer x) {
    for (Object[] p : specialNumbers) {
      if ((int) p[0] == x) return (String) p[1];
    }
    return "nothing";
    }
  
    static final Object[][] specialNumbers = {
        {42, "everything"},
        {42 * 42, "everything squared"},
    };
}
```