https://www.codewars.com/kata/5bf774a81505a7413400006a

## JavaScript
```js
function fix(paragraph) {
  if (paragraph == "") return ""
  paragraph = paragraph.split(". ");
  let i = 0;
  while (i<paragraph.length) {
    paragraph[i] = paragraph[i][0].toUpperCase() + paragraph[i].slice(1);
    i++;
  }
  return paragraph.join(". ")
}
```

## Python
```py
def fix(paragraph):
    if paragraph == "": return ""
    paragraph = paragraph.split(". ")
    i = 0
    while i<len(paragraph):
        paragraph[i] = paragraph[i][0].upper() + paragraph[i][1:]
        i += 1
    return ". ".join(paragraph)
```