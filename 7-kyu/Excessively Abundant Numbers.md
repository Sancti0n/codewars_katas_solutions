https://www.codewars.com/kata/56a75b91688b49ad94000015

## Python
```py
def abundant_number(num):
    t = []
    for i in range(1, int(num/2)+1):
        if num/i == int(num/i): t.append(i)
    return sum(t)>num
```

## JavaScript
```js
function abundantNumber(num) {
  let c = 0;
  for (let i=1;i<=num/2;i++) {
    if (parseInt(num/i) == num/i) c += i;
  }
  return c>num
}
```

## Java
```java
public class Kata {
  public static boolean abundantNumber(int num) {
    int c = 0;
    double n = (double) num;
    for (int i=1;i<=n/2;i++) {
      if ((n/i)%1 == 0) c += i;
    }
    return c>num;
  }
}
```