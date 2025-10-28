https://www.codewars.com/kata/55f1b763dd670651620000ce

## Python
```python
def count_char_occurrences(strng, char):
    return strng.count(char)
```

## Java
```java
interface Count {
	static int countCharOccurrences(String s, char c) {
    return s.length() - s.replace("" + c, "").length();
  }
}
```