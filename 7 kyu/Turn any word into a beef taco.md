If you like Taco Bell, you will be familiar with their signature doritos locos taco. They're very good.

Why can't everything be a taco? We're going to attempt that here, turning every word we find into the taco bell recipe with each ingredient.

We want to input a word as a string, and return a list representing that word as a taco.

all vowels (except 'y') = beef

t = tomato ; l = lettuce ; c = cheese ; g = guacamole ; s = salsa


## JavaScript
```js
function tacofy(word) {
  let d = {"t": "tomato", "l": "lettuce", "c": "cheese", "g": "guacamole", "s": "salsa"};
  let t = ["shell"];
  for (let i=0;i<word.length;i++) {
    if (word[i].toLowerCase() in d) t.push(d[word[i].toLowerCase()]);
    else if (["a", "e", "i", "o", "u"].indexOf(word[i].toLowerCase())>-1) t.push("beef");
  }
  return t.concat(["shell"])
}
```

## Python
```python
def tacofy(word):
    d = {"t": "tomato", "l": "lettuce", "c": "cheese", "g": "guacamole", "s": "salsa"}
    t = ["shell"]
    for i in word:
        if i.lower() in d: t.append(d[i.lower()])
        elif i.lower() in ["a", "e", "i", "o", "u"]: t.append("beef")
    return t + ["shell"]
```