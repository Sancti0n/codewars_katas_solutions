https://www.codewars.com/kata/56f3f6a82010832b02000f38

## Python
```python
def describe_age(a):
    return "You're a(n) "+("kid"if a<13else"teenager"if a<18else "adult"if a<65else "elderly")
```

## JavaScript
```js
function describeAge(age) {
  return "You're a(n) "+(age<13?"kid":age<18?"teenager":age<65?"adult":"elderly")
}
```

## Java
```java
public class C{public static String describeAge(int a){return"You're a(n) "+(a<13?"kid":a<18?"teenager":a<65?"adult":"elderly");}}
```