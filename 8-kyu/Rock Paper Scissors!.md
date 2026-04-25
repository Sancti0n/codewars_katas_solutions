https://www.codewars.com/kata/5672a98bdbdd995fad00000f

## Python
```py
def rps(p1, p2):
    if p1 == p2: return 'Draw!'
    elif p1 == 'scissors':
        if p2 == 'paper': return 'Player 1 won!'
        return 'Player 2 won!'
    elif p1 == 'paper':
        if p2 == 'rock': return 'Player 1 won!'
        return 'Player 2 won!'
    elif p1 == 'rock':
        if p2 == 'scissors': return 'Player 1 won!'
        return 'Player 2 won!'
```

## JavaScript
```js
const rps = (p1, p2) => {
  if (p1 === p2) return 'Draw!'
  else if (p1 === 'scissors') {
    if (p2 === 'paper') return 'Player 1 won!'
    return 'Player 2 won!'
  }
  else if (p1 === 'paper') {
    if (p2 === 'rock') return 'Player 1 won!'
    return 'Player 2 won!'
  }
  else if (p1 === 'rock') {
    if (p2 === 'scissors') return 'Player 1 won!'
        return 'Player 2 won!'
  }
};
```

## Java
```java
public class Kata {
  public static String rps(String p1, String p2) {
    if (p1 == p2) return "Draw!";
    else if (p1 == "scissors") {
      if (p2 == "paper") return "Player 1 won!";
      return "Player 2 won!";
    }
    if (p1 == "paper") {
      if (p2 == "rock") return "Player 1 won!";
      return "Player 2 won!";
    }
    if (p1 == "rock") {
      if (p2 == "scissors") return "Player 1 won!";
      return "Player 2 won!";
    }
    return null;
  }
}
```

## PHP
```php
function rpc ($p1, $p2) {
  if ($p1 == $p2) return 'Draw!';
  else if ($p1 == 'scissors') {
    if ($p2 == 'paper') return 'Player 1 won!';
    return 'Player 2 won!';
  }
  else if ($p1 == 'paper') {
    if ($p2 == 'rock') return 'Player 1 won!';
    return 'Player 2 won!';
  }
  else if ($p1 == 'rock') {
    if ($p2 == 'scissors') return 'Player 1 won!';
        return 'Player 2 won!';
  }
}
```

## TypeScript
```ts
export function rps(p1: string, p2: string): string {
  let p;
  if (p1 === p2) return 'Draw!';
  else if (p1 === 'scissors') {
    p = p2 === 'paper' ? 1 : 2
  }
  else if (p1 === 'paper') {
    p = p2 === 'rock' ? 1 : 2;
  }
  else if (p1 === 'rock') {
    p = p2 === 'scissors' ? 1 : 2;
  }
  return `Player ${p} won!`
}
```