https://www.codewars.com/kata/5808e2006b65bff35500008f

## Python
```python
import string
def position(alphabet):
    x = list(string.ascii_lowercase)
    return 'Position of alphabet: '+str(x.index(alphabet)+1)
```

## JavaScript
```js
function position(letter){
  let x = String.fromCharCode(...Array(123).keys()).slice(97).split("");
  return "Position of alphabet: "+(x.indexOf(letter)+1).toString()
}
```

## Java
```java
public class Kata {
  public static int findIndex(String arr[], String v) {
    for (int i=0;i<arr.length;i++) {
      if (arr[i].equals(v)) return i+1;
    }
    return -1;
  }
  
  public static String position(char alphabet) {
    String w = "";
    for (char c='a';c<='z';c++) w += c;
    String[] arr = w.split("");
    return "Position of alphabet: "+String.valueOf(findIndex(arr, String.valueOf(alphabet)));
  }
}
```

## PHP
```php
function position(string $alphabet): string {
  $t = range('a', 'z');
  return "Position of alphabet: ".array_search($alphabet, $t)+1;
}
```