https://www.codewars.com/kata/513e08acc600c94f01000001

## JavaScript
```js
function rgbtohex(rgb) {
    if (rgb>255) rgb = 255
    if (rgb<0) rgb = 0
    var hex = Number(rgb).toString(16)
    if (hex.length < 2) hex = "0" + hex
    return hex.toUpperCase()
}

function rgb(r, g, b){ 
    return rgbtohex(r)+rgbtohex(g)+rgbtohex(b)
}
```

## PHP
```php
function rgbtohex($v) {
    if ($v>255) $v = 255;
    if ($v<0) $v = 0;
    $hex = base_convert($v,10,16);
    if (strlen($hex) < 2) $hex = "0".$hex;
    return strtoupper($hex);
}

function rgb($r,$g,$b){
  return rgbtohex($r).rgbtohex($g).rgbtohex($b);
}
```

## Python
```python
def rgbtohex(v):
    if v>255: v = 255
    if v<0: v = 0
    hexa = hex(v)[2:len(hex(v))]
    if len(hexa) < 2: hexa = "0" + hexa
    return hexa.upper()

def rgb(r, g, b):
    return rgbtohex(r)+rgbtohex(g)+rgbtohex(b)
```