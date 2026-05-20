https://www.codewars.com/kata/5434d8487abffa2f64000db6

## JavaScript
```js
var BARK  = 'woof woof';
var SLEEP = 'zzzzzzzzz....';

function dog_bark_by_default(bark){
  return bark == false ? SLEEP : BARK;
}

function dog_bark_only_if_told_so(bark){
  return bark == true ? BARK : SLEEP;
}

function dog_dont_bark_by_default(dont_bark){
  return dont_bark == false ? BARK : SLEEP;
}

function dog_dont_bark_only_if_told_so(dont_bark){
  return dont_bark == true ? SLEEP : BARK;
}
```