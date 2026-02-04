https://www.codewars.com/kata/525f4206b73515bffb000b21

## Java
```java
public class Kata {
  public static String add(String a, String b) {
    int m = Math.max(a.length(), b.length());
    a = "0".repeat(m-a.length())+a;
    b = "0".repeat(m-b.length())+b;
    String result = "";
    int res = 0;
    int r = 0;
    for (int i=m-1;i>-1;i--) {
      res = Integer.parseInt(String.valueOf(a.charAt(i))) + Integer.parseInt(String.valueOf(b.charAt(i))) + r;
      r = res > 9 ? 1 : 0;
      result = String.valueOf(res%10) + result;
    }
    while (result.charAt(0) == '0' && r<1) {
      result = result.substring(1);
    }
    return r>0 ? "1" + result : result;
  }
}
```

## JavaScript
```js
function fill(arr, max) {
    while (arr.length< max) {
        arr.unshift('0')
    }
}

function add(a, b) {
    let A = a.split('')
    let B = b.split('')
    let C = []
    let temp = 0
    let c = 0
    maximum = Math.max(A.length, B.length)
    if (maximum == A.length) fill(B, maximum)
    else fill(A, maximum)
    for (let i=maximum-1;i>-1;i--) {
        temp = Number(A[i])+Number(B[i])+c
        if (temp>9) {
            C.unshift(temp%10)
            c = Math.floor(temp/10)
        }
        else {
            C.unshift(temp)
            c = 0
        }
    }
    if (c>0) {
        C.unshift(c)
    }
    return C.join('')
}
```