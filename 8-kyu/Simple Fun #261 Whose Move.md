https://www.codewars.com/kata/59126992f9f87fd31600009b

## Python
```python
def whoseMove(lastPlayer, win):
    if win: return lastPlayer
    if lastPlayer == "black": return "white"
    return "black"
```

## PHP
```php
function whose_move(string $last_player, bool $win): string {
  if ($win) return $last_player;
  if ($last_player == "black") return "white";
  return "black";
}
```

## JavaScript
```js
function whoseMove(lastPlayer, win) {
  if (win) return lastPlayer
  if (lastPlayer == "black") return "white"
  return "black"
}
```