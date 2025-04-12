A stream of data is received and needs to be reversed.

Each segment is 8 bits long, meaning the order of these segments needs to be reversed, for example:

11111111  00000000  00001111  10101010
 (byte1)   (byte2)   (byte3)   (byte4)

should become:

10101010  00001111  00000000  11111111
 (byte4)   (byte3)   (byte2)   (byte1)

The total number of bits will always be a multiple of 8.

The data is given in an array as such:

[1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]

## Python
```python
def data_reverse(data):
    t = data[:8]
    for i in range(1, int(len(data)/8)):
        t = data[i*8:(i+1)*8] + t
    return t
```

## JavaScript
```js
function dataReverse(data) {
  let t = data.slice(0,8);
  for (let i=1;i<data.length/8;i++) {
    t = data.slice(i*8, (i+1)*8).concat(t)
  }
  return t
}
```