https://www.codewars.com/kata/5800e9b515e97e7cbb00154f

## JavaScript
```js
function areaVolume(a,b,h,l) {
  let surface = h*(a + b) + l*(a + b + ((h**2 + ((b-a)/2)**2)**.5)*2);
  let volume = .5*h*(a+b)*l;
  return [Math.round(surface), Math.round(volume)]
}
```