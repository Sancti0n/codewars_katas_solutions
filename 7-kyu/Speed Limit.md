https://www.codewars.com/kata/635a7827bafe03708e3e1db6

## Python
```py
def speed_limit(speed, signals):
    s = 0
    for i in signals:
        if speed-i >= 30:
            s += 500
        elif speed-i >= 20:
            s += 250
        elif speed-i >= 10:
            s += 100
    return s
```

## Java
```java
public class Kata {
  public static int speedLimit(final int speed, final int[] signals) {
    int s = 0;
    for (int i=0;i<signals.length;i++) {
      if (speed-signals[i] >= 30) {
        s += 500;
      }
      else if (speed-signals[i] >= 20) {
        s += 250;
      }
      else if (speed-signals[i] >= 10) {
        s += 100;
      }
    }
    return s;
  }
}
```