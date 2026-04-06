https://www.codewars.com/kata/565abd876ed46506d600000d

## JavaScript
```js
function f(x) {
  return (3/2)*Math.sin(x)**3
}

function sum(n, a, b) {
  let s1 = 0, s2 = 0, h = (b-a)/n;
  for (let j=1;j<=Math.floor(n/2);j++) {
    s1 += f(a + (2*j - 1)*h);
  }
  for (let k=1;k<=Math.floor(n/2 - 1);k++) {
    s2 += f(a + 2*k*h);
  }
  return 4*s1 + 2*s2
}

function simpson(n) {
  let a = 0, b = Math.PI;
  return ((b-a)/(3*n))*(f(a)+f(b)+sum(n, a, b))
}
```

## TypeScript
```ts
export function f(x: number): number {
  return (3/2)*Math.sin(x)**3
}

export function sum(n: number, a: number, b: number): number {
  let s1 = 0, s2 = 0, h = (b-a)/n;
  for (let j=1;j<=Math.floor(n/2);j++) {
    s1 += f(a + (2*j - 1)*h);
  }
  for (let k=1;k<=Math.floor(n/2 - 1);k++) {
    s2 += f(a + 2*k*h);
  }
  return 4*s1 + 2*s2
}

export const simpson = (n:number): number => {
  let a = 0, b = Math.PI;
  return ((b-a)/(3*n))*(f(a)+f(b)+sum(n, a, b))
}
```

## Python
```py
import math

def f(x):
    return (3/2)*math.sin(x)**3

def sum(n, a, b):
    s1, s2, h = 0, 0, (b-a)/n
    for j in range(1, n//2 + 1):
        s1 += f(a + (2*j - 1)*h)
    for k in range(1, n//2):
        s2 += f(a + 2*k*h)
    return 4*s1 + 2*s2

def simpson(n):
    a, b = 0, math.pi
    return ((b-a)/(3*n))*(f(a)+f(b)+sum(n, a, b))
```

## PHP
```php
function f($x) {
  return (3/2)*sin($x)**3;
}

function sum($n, $a, $b) {
  $s1 = 0;
  $s2 = 0;
  $h = ($b-$a)/$n;
  for ($j=1;$j<=$n/2;$j++) {
    $s1 += f($a + (2*$j - 1)*$h);
  }
  for ($k=1;$k<=$n/2 - 1;$k++) {
    $s2 += f($a + 2*$k*$h);
  }
  return 4*$s1 + 2*$s2;
}

function simpson($n) {
  $a = 0;
  $b = pi();
  return (($b-$a)/(3*$n))*(f($a)+f($b)+sum($n, $a, $b));
}
```

## Java
```java
public class SimpsonIntegration {
  
  public static double f(double x) {
    return (3.0/2.0)*Math.pow(Math.sin(x), 3);
  }
  
  public static double sum(double n, double a, double b) {
  double s1 = 0;
  double s2 = 0;
  double h = (b-a)/n;
  for (int j=1;j<=n/2;j++) {
    s1 += f(a + (2*j - 1)*h);
  }
  for (int k=1;k<=n/2 - 1;k++) {
    s2 += f(a + 2*k*h);
  }
  return 4*s1 + 2*s2;
}
  
  public static double simpson(double n) {
    double a = 0;
    double b = Math.PI;
    return ((b-a)/(3*n))*(f(a)+f(b)+sum(n, a, b));
  }
}
```