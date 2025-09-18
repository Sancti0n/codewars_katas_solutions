https://www.codewars.com/kata/5b043e3886d0752685000009

## Python
```py
def michael_pays(cost):
    return round(cost if cost<5 else 2*cost/3 if cost/3<=10 else cost-10, 2)
```

## JavaScript
```js
function michaelPays(cost) {
  return Math.round(100*(cost<5 ? cost : cost/3<=10 ? 2*cost/3 : cost-10))/100
}
```

## Java
```java
public class PizzaPayments {
  public static double michaelPays(double cost) {
    return (double) Math.round(100*(cost<5 ? cost : cost/3<=10 ? 2*cost/3 : cost-10))/100;
  }
}
```