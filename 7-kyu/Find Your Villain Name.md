https://www.codewars.com/kata/536c00e21da4dc0a0700128b

## JavaScript
```js
function getVillainName(birthday) {
  const d = ["Mustache","Pickle","Hood Ornament","Raisin","Recycling Bin","Potato","Tomato","House Cat","Teaspoon","Laundry Basket"];
  const month = ["Evil", "Vile", "Cruel", "Trashy", "Despicable", "Embarrassing", "Disreputable", "Atrocious", "Twirling", "Orange", "Terrifying", "Awkward"];
  return "The " + month[birthday.getMonth()] + " " + d[birthday.getDate()%10];
}
```

## Python
```py
from datetime import datetime

def get_villain_name(birthdate: datetime) -> str:
    first = [
        "The Evil","The Vile","The Cruel", "The Trashy","The Despicable",
        "The Embarrassing", "The Disreputable","The Atrocious", "The Twirling",
        "The Orange","The Terrifying", "The Awkward"
    ]
    last = [
        "Mustache", "Pickle", "Hood Ornament", "Raisin", "Recycling Bin",
        "Potato", "Tomato", "House Cat", "Teaspoon", "Laundry Basket"
    ]
    return first[birthdate.month-1] + " " + last[birthdate.day%10]
```

## Java
```java
import java.time.LocalDate;

public class Kata {
  public static String getVillianName(LocalDate birthdate) {
    String[] first = { "The Evil","The Vile","The Cruel", "The Trashy","The Despicable", "The Embarrassing", "The Disreputable","The Atrocious", "The Twirling",  "The Orange","The Terrifying", "The Awkward" };
    String[] last = { "Mustache", "Pickle", "Hood Ornament", "Raisin", "Recycling Bin", "Potato", "Tomato", "House Cat", "Teaspoon", "Laundry Basket" };
    return first[birthdate.getMonthValue()-1] + " " + last[birthdate.getDayOfMonth()%10];
  }
}
```