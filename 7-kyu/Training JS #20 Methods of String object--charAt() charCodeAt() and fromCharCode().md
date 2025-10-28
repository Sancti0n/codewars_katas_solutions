https://www.codewars.com/kata/57284d23e81185ae6200162a

## JavaScript
```js
function topSecret(str){
  let min = [...Array(26).keys()].map(i => String.fromCharCode(i + 97));
  let max = [...Array(26).keys()].map(i => String.fromCharCode(i + 65));
  let w = "";
  for (let i=0;i<str.length;i++) {
    if (min.indexOf(str[i]) > -1) {
      w += min[(min.indexOf(str[i])+23)%26]
    }
    else if (max.indexOf(str[i]) > -1) {
      w += max[(max.indexOf(str[i])+23)%26]
    }
    else w += str[i]
  }
  return w
  
}
//question1: The top secret file number is...
answer1="2829";
//question2: Super agent's name is...
answer2="GbebK";
//question3: He stole the treasure is...
answer3="John's wife";
```