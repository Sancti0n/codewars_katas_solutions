https://www.codewars.com/kata/5758a91bbd1fdd2033000947

## JavaScript
```js
function anArgument(...arg) {
  if (arg.length == 0) return 'You didn\'t give me any arguments.'
  else if (arg.length == 1) return 'You gave me 1 argument and it is "'+ arg[0]+'".';
  let s = '"' + arg[0] + '"';
  if (arg.length > 1) {
    for (let i=1;i<arg.length;i++) {
      if (i+1 == arg.length) s += ' and "'+arg[i]+'".';
      else s += ', "'+arg[i]+'"';
    }
  }
  return "You gave me " + arg.length.toString() + " arguments and they are " + s 
}
```