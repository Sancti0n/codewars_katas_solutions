https://www.codewars.com/kata/56e7d40129035aed6c000632

## Python
```py
import math

def easyline(n):
    i, s = [0,0]
    while i <= n:
        s += math.comb(n, i)**2
        i += 1
    return s
```

## JavaScript
```js
function facto(n) {
    if (n < 0) return 0n;
    if (n === 0 || n === 1) return 1n;

    let resultat = 1n;
    const N_BigInt = BigInt(n);

    for (let i = 2n; i <= N_BigInt; i++) {
        resultat *= i;
    }
    return resultat;
}

function log10(bigint) {
    if (bigint < 0n) return NaN;
    const s = bigint.toString(10);
    return s.length + Math.log10("0." + s.substring(0, 15))
}

function log(bigint) {
    return log10(bigint) * Math.log(10);
}

function easyLine(n) {
    let i = 0n, s = 0n;
    n = BigInt(n);
    while (i <= n) {
        s += (facto(n) / (facto(n - i) * facto(i))) ** 2n;
        i++;
    }
    return Math.round(log(s))
}
```

## JavaScript
```js
function easyLine(n) {
  for (var i=1, s = 1; i<= n; i++) {
    s *= (n+i)/i;
  }
  return Math.round(Math.log(s));
}
```