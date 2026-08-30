https://www.codewars.com/kata/56d46b8fda159582e100001b

## JavaScript
```js
function travel(totalTime, runTime, restTime, speed) {
  let cycleTime = runTime + restTime;
  let fullCycles = Math.floor(totalTime / cycleTime);
  let remainingTime = totalTime % cycleTime;
  let extraRunTime = Math.min(remainingTime, runTime);
  let totalRunTime = (fullCycles * runTime) + extraRunTime;
  return totalRunTime * speed;
}
```

## Python
```py
def travel(total_time, run_time, rest_time, speed):
    cycle_time = run_time + rest_time
    full_cycles = total_time // cycle_time
    remaining_time = total_time % cycle_time
    extra_run_time = min(remaining_time, run_time)
    total_run_time = (full_cycles * run_time) + extra_run_time
    return total_run_time * speed
```

## Java
```java
public class Kata {
  public static int travel(int totalTime, int runTime, int restTime, int speed) {
    int cycleTime = runTime + restTime;
    int fullCycles = totalTime/cycleTime;
    int remainingTime = totalTime % cycleTime;
    int extraRunTime = Math.min(remainingTime, runTime);
    int totalRunTime = (fullCycles * runTime) + extraRunTime;
    return totalRunTime * speed;
  }
}
```