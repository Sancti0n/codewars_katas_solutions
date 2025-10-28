https://www.codewars.com/kata/5483930b98aa44a34d000e54

## JavaScript
```js
function Calculator(vatRate){ 
  this.getNet = function(grossPrice){
    return parseFloat((grossPrice/(1+vatRate/100)).toFixed(2))
  }
  this.getVat = function(grossPrice){
    return parseFloat((grossPrice-(grossPrice/(1+vatRate/100))).toFixed(2))
  }
}
```