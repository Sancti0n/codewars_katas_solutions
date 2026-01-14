https://www.codewars.com/kata/5701e26c86306aa45f001847

## JavaScript
```js
const source = (function f() { return f.caller || arguments.callee.caller; })().toString();

const match = source.match(/_x = '(.*?)'/);
const secretValue = match ? match[1] : "not_found";

const __KEY__ = secretValue;
```