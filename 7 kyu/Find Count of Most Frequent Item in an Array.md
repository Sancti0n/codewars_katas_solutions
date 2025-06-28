https://www.codewars.com/kata/56582133c932d8239900002e

## Python
```python
def most_frequent_item_count(collection):
    max = 0
    for i in collection:
        if max < collection.count(i): max = collection.count(i)
    return max
```

## JavaScript
```js
function mostFrequentItemCount(collection) {
  let max = 0;
  for (let i=0;i<collection.length;i++) {
    if (max < collection.filter(elt => elt === collection[i]).length) max = collection.filter(elt => elt === collection[i]).length;
  }
  return max
}
```

## Java
```java
public class Kata {
  
  public static int countFreq(int arr[], int n) {
    int s = 0;
    for (int i=0;i<arr.length;i++) {
      if (n == arr[i]) s++;
    }
    return s;
  }
  
  public static int mostFrequentItemCount(int[] collection) {
    int max = 0;
    for (int i=0;i<collection.length;i++) {
      if (max < countFreq(collection, collection[i])) {
        max = countFreq(collection, collection[i]);
      }
    }
    return max;
  }
}
```