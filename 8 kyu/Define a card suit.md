https://www.codewars.com/kata/5a360620f28b82a711000047

## Python
```python
def define_suit(card):
    if card[-1] == 'C': return 'clubs'
    if card[-1] == 'S': return 'spades'
    if card[-1] == 'D': return 'diamonds'
    return 'hearts'
```

## JavaScript
```js
function defineSuit(card) {
  if (card[card.length-1] == '♣') return 'clubs'
  if (card[card.length-1] == '♦') return 'diamonds'
  if (card[card.length-1] == '♥') return 'hearts'
  return 'spades'
}
```