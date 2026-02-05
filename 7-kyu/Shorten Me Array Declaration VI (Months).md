https://www.codewars.com/kata/5a54dd0d6f46de8ea50005c9

## JavaScript
```js
array=()=>{a=[...Array(12)].map((_,i)=>new Date(0,i).toLocaleString('en',{month:'long'}));return a.concat(a)}
```