https://www.codewars.com/kata/56b71b1dbd06e6d88100092a

## JavaScript
```js
function buildFun(n) {
    var res = []
	for (var i = 0; i< n; i++){
        const j = i;
        res.push(function() {
            return j
        })
	}
	return res
}
```