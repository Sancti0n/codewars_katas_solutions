https://www.codewars.com/kata/6097a9f20d32c2000d0bdb98

## JavaScript
```js
function i(word) {
  if (!word || word[0] !== word[0].toUpperCase() || word[0] === "I") {
    return "Invalid word";
  }
  
  const voyelles = (word.match(/[aeiou]/gi) || []).length;
  const totalLettres = (word.match(/[a-z]/gi) || []).length;
  const consonnes = totalLettres - voyelles;
  
  if (voyelles >= consonnes) {
    return "Invalid word";
  }
  
  return "i" + word;
}
```