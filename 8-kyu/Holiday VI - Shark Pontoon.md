https://www.codewars.com/kata/57e921d8b36340f1fd000059

## Python
```py
def shark(pontoon_distance, shark_distance, you_speed, shark_speed, dolphin):
    if dolphin:
        shark_speed /= 2
    time_human = pontoon_distance/you_speed
    time_shark = shark_distance/shark_speed
    return "Alive!" if time_human < time_shark else "Shark Bait!"
```

## JavaScript
```js
function shark(pontoonDistance, sharkDistance, youSpeed, sharkSpeed, dolphin) {
  if (dolphin) {
    sharkSpeed /= 2;
  }
  let timeHuman = pontoonDistance/youSpeed;
  let timeShark = sharkDistance/sharkSpeed;
  return timeHuman < timeShark ? "Alive!" : "Shark Bait!";
}
```

## TypeScript
```ts
export function shark(pontoonDistance : number, sharkDistance : number, youSpeed : number, sharkSpeed : number, dolphin : boolean) : string {
  if (dolphin) {
    sharkSpeed /= 2;
  }
  let timeHuman = pontoonDistance/youSpeed;
  let timeShark = sharkDistance/sharkSpeed;
  return timeHuman < timeShark ? "Alive!" : "Shark Bait!";
}
```

## PHP
```php
function shark(int $pontoonDistance, int $sharkDistance, int $youSpeed, int $sharkSpeed, bool $dolphin): string {
  if ($dolphin) {
    $sharkSpeed /= 2;
  }
  $timeHuman = $pontoonDistance/$youSpeed;
  $timeShark = $sharkDistance/$sharkSpeed;
  return $timeHuman < $timeShark ? "Alive!" : "Shark Bait!";
}
```

## Java
```java
public class SharkPontoon {
  public static String shark(double pontoonDistance, double sharkDistance, double youSpeed, double sharkSpeed, boolean dolphin) {
    if (dolphin) {
      sharkSpeed /= 2;
    }
    double timeHuman = pontoonDistance/youSpeed;
    double timeShark = sharkDistance/sharkSpeed;
    return timeHuman < timeShark ? "Alive!" : "Shark Bait!";
  }
}
```