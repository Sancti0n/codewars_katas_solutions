https://www.codewars.com/kata/528d9adf0e03778b9e00067e

## Python
```python
def mine_location(field):
    for i in range(len(field)):
        if 1 in field[i]: return [i, field[i].index(1)]
```

## JavaScript
```js
function mineLocation(field) {
  for (let i=0;i<field.length;i++) {
    if (field[i].indexOf(1)>-1) return [i, field[i].indexOf(1)]
  }
}
```

## Java
```java
public class MineFinder {
	
	public static int[] findMine(int[][] field){
    for (int i=0;i<field.length;i++) {
      for (int j=0;j<field[i].length;j++) {
        if (field[i][j] == 1) return new int[] {i, j};
      }
    }
    return new int[] {};
	}
}
```

## PHP
```php
function mineLocation(array $field): array {
  for ($i=0;$i<count($field);$i++) {
    if (array_search(1, $field[$i])>-1) return [$i, array_search(1, $field[$i])];
  }
}
```