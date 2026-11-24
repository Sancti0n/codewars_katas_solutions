https://www.codewars.com/kata/5840946ea3d4c78e90000068

## JavaScript
```js
function gameWinners(gryffindor, slytherin) {
  let g = gryffindor[0] + (gryffindor[1] == "yes" ? 150 : 0);
  let s = slytherin[0] + (slytherin[1] == "yes" ? 150 : 0);
  return g == s ? "It's a draw!" : g > s ? "Gryffindor wins!" : "Slytherin wins!"; 
};
```

## Python
```py
def game_winners(gryffindor, slytherin):
    g = gryffindor[0] + len(gryffindor[1])%2*150
    s = slytherin[0] + len(slytherin[1])%2*150
    return "It's a draw!" if g == s else "Gryffindor wins!" if g > s else "Slytherin wins!"
```