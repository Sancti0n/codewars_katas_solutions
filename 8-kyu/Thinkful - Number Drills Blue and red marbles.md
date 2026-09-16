https://www.codewars.com/kata/5862f663b4e9d6f12b00003b

## JavaScript
```js
function guessBlue(blueStart, redStart, bluePulled, redPulled) {
  let b = blueStart - bluePulled;
  return b / (b + redStart - redPulled);
}
```

## Python
```py
def guess_blue(blue_start, red_start, blue_pulled, red_pulled):
    b = blue_start - blue_pulled
    return b / (b + red_start - red_pulled)
```

## Java
```java
public class BlueAndRedMarbles {
  public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
    double b = blueStart - bluePulled;
    return (double) b / (b + redStart - redPulled);
  }
}
```