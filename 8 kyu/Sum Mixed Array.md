https://www.codewars.com/kata/57eaeb9578748ff92a000009

## Python
```python
def sum_mix(arr):
    return sum(int(i) for i in arr)
```

## JavaScript
```js
function sumMix(x){
  return x.reduce((p, c) => parseInt(p) + parseInt(c), 0)
}
```

## PHP
```php
function sum_mix($a) {
  return array_sum($a);
}
```

## Java
```java
import java.util.List;

public class MixedSum {
	public int sum(List<?> arr) {
    int sum = 0;
    for (int i=0;i<arr.size();i++) {
      if (arr.get(i).getClass().getSimpleName().equals("String")) {
        sum += Integer.valueOf((String) arr.get(i));
      }
      else sum += (int) arr.get(i);
    }
		return sum;
	}
}
```

## TypeScript
```ts
export function sumMix(x: any[]): number {
  return x.reduce((p, c) => parseInt(p) + parseInt(c), 0)
}
```