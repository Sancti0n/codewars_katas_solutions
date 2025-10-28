https://www.codewars.com/kata/569924899aa8541eb200003f

## Python
```python
import string

def quicksum(packet):
    L = list(string.ascii_uppercase)
    s = 0
    for i in range(len(packet)):
        if packet[i] in L: s += (i+1)*(L.index(packet[i])+1)
        elif packet[i] != " ": return 0
    return s
```

## JavaScript
```js
function quicksum(packet){
  let L = String.fromCharCode(...Array(91).keys()).slice(65).split("");
  let s = 0;
  for (let i=0;i<packet.length;i++) {
    if (L.indexOf(packet[i])>-1) s += (i+1)*(L.indexOf(packet[i])+1);
    else if (packet[i] != " ") return 0
  }
  return s
}
```