https://www.codewars.com/kata/5d339b01496f8d001054887f

## Python
```py
def find_x(n):
    if n == 0: return 0
    MOD = 10**9 + 7
    res = 3*(pow(2, n+1, MOD)-n-2)
    return res % MOD
```

## JavaScript
```js
function findX(n) {
  if (n === 0) return 0;

  const N = BigInt(n);
  const MOD = BigInt(1e9 + 7);

  function powerMod(base, exp, mod) {
    let res = 1n;
    base = base % mod;
    while (exp > 0n) {
      if (exp % 2n === 1n) res = (res * base) % mod;
      base = (base * base) % mod;
      exp = exp / 2n;
    }
    return res;
  }

  let p = powerMod(2n, N + 1n, MOD);
  let result = (3n * (p - N - 2n)) % MOD;
  
  return Number((result + MOD) % MOD);
}
```