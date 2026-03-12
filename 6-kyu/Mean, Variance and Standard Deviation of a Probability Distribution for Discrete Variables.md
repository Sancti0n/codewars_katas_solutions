https://www.codewars.com/kata/5708ccb0fe2d01677c000565

## JavaScript
```js
function statsDiscDistr(distrib) {
  var mean = 0, variance = 0, stdDev = 0;
  
  // Check distribution
  let s = 0, b1 = false;
  for (let a=0;a<distrib.length;a++) {
    s += distrib[a][1];
    if (!Number.isInteger(distrib[a][0])) {
      b1 = true;
    }
  }
  s = s.toPrecision(15);
  
  if (b1 && s != 1) {
    return "It's not a valid distribution and furthermore, one or more variable value are not integers"
  }
  if (b1) {
    return "All the variable values should be integers"
  }
  if (s != 1) {
    return "It's not a valid distribution"
  }
  
  // Mean
  for (let i=0;i<distrib.length;i++) {
    mean += distrib[i][0]*distrib[i][1];
  }
  
  // Variance
  for (let j=0;j<distrib.length;j++) {
    variance += distrib[j][1]*(distrib[j][0]-mean)**2
  }
  
  // Standard Deviation
  stdDev = variance**.5;
  
  return [mean, variance, stdDev];
}
```

## Python
```py
def stats_disc_distr(distrib):
    mean, variance, std_dev = 0, 0, 0
    
    # Check Distribution
    s, b = 0, False
    for i in range(len(distrib)):
        s += distrib[i][1]
        if not isinstance(distrib[i][0], int):
            b = True
    s = round(s, 15)
    
    if (b and s != 1) :
        return "It's not a valid distribution and furthermore, one or more variable value are not integers"
    if b:
        return "All the variable values should be integers"
    if s != 1:
        return "It's not a valid distribution"
    
    # Mean
    for j in range(len(distrib)):
        mean += distrib[j][0]*distrib[j][1]
    
    # Variance
    for k in range(len(distrib)):
        variance += distrib[k][1]*(distrib[k][0]-mean)**2
        
    # Standard Deviation
    std_dev = variance**.5
    
    return [mean, variance, std_dev]
```