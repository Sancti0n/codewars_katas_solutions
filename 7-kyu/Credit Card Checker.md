https://www.codewars.com/kata/56d55dcdc87df58c81000605

## Python
```py
def valid_card(card):
    card = card.replace(' ', '')
    s = 0
    for i in range(len(card)):
        if i%2:
            s += int(card[i])
        else:
            value = str(int(card[i])*2)
            s += sum([int(i) for i in value])
    return s%10 < 1
```

## JavaScript
```js
function sum(s) {
  let somme = 0;
  for (let i=0;i<s.length;i++) {
    somme += parseInt(s[i]);
  }
  return somme;
}

function validCard(card) {
  card = card.replace(/ /g, '');
  let s = 0;
  for (let i=0;i<card.length;i++) {
    if (i%2) {
      s += parseInt(card[i]);
    }
    else {
      let value = (parseInt(card[i])*2).toString();
      s += sum(value);
    }
  }
  return s%10 < 1;
}
```