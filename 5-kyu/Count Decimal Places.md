https://www.codewars.com/kata/529cd9c409a361b676000021

## JavaScript
```js
function decimalPlaces(n) {
   if (isNaN(n) || n === Infinity || n === -Infinity || n%1 === 0) return 0
   let v = n.toString();
   let t;
   if (v.includes('.')) {
      t = v.split('.');
      if (!t[1].includes('e-')) return t[1].length
   }
   else if (v.includes('e-')) t = v.split('e-');
   if (t[1].includes('e-')) return t[1].split('e-')[0].length + Number(t[1].split('e-')[1]);
   return Number(t[1])
}
```