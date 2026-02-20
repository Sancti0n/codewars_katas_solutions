https://www.codewars.com/kata/56c31c6ec44a3ab033000eaf

## JavaScript
```js
class DataSet {
  constructor(...data) {
    this.data = data;
    this.setMean();
    this.setVar();
  }
  
  setMean() {
    let s = 0;
    for (let i=0;i<this.data.length;i++) {
      s += this.data[i];
    }
    this.mean = s/this.data.length
    return this.mean
  }
  
  setVar() {
    let m = this.setMean(); 
    let variance = 0;
    for (let j=0;j<this.data.length;j++) {
      variance += (this.data[j] - m)**2;
    }
    this.variance = variance/this.data.length;
    this.stdDeviation = this.variance**.5; 
    return this.variance;
  }
}
```