https://www.codewars.com/kata/66001d26a43fba02c5c8adc4

## JavaScript
```js
const Spectrometer = {
  getHeaviest: function(atomicMasses) {
    let t = atomicMasses.sort((a,b)=>b-a);
    return t[0] == undefined ? 0: t[0]
  }  
};
```