https://www.codewars.com/kata/5a726f16373c2ee6c60000db

## JavaScript
```js
function hidePasswordFromConnection(urlString) {
  let u = urlString.split("password=")[0] + "password=";
  let l = "*".repeat((urlString.split("password=")[1]).split("&")[0].length);
  let r = (urlString.split("password=")[1]).split("&")[1]
  return r ? u+l+"&"+r : u+l;
}
```