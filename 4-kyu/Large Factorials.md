https://www.codewars.com/kata/557f6437bf8dcdd135000010

## JavaScript
```js
function multiplierChaineParEntier(numStr, multiplicateur) {
  let retenue = 0, resultat = [], produit = 0;
  
  for (let i = numStr.length - 1; i >= 0; i--) {
    produit = parseInt(numStr[i]) * multiplicateur + retenue;
    resultat.push(produit % 10);
    retenue = Math.floor(produit / 10);
  }
  
  while (retenue) {
    resultat.push(retenue % 10);
    retenue = Math.floor(retenue / 10);
  }
  
  return resultat.reverse().join('');
}

function factorial(n) {
  if (n === 0 || n === 1) return "1";
  let res = "1";
  for (let i = 2; i <= n; i++) {
    res = multiplierChaineParEntier(res, i);
  }
  return res
}
```