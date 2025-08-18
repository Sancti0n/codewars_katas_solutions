https://www.codewars.com/kata/5556282156230d0e5e000089

## Python
```python
def dna_to_rna(dna):
    return dna.replace('T', 'U')
```

## PHP
```php
function dnaToRna($str) {
  return str_replace("T", "U", $str);
}
```

## JavaScript
```js
function DNAtoRNA(dna) {
  return dna.replace(/T/g, 'U')
}
```

## Java
```java
public class Bio {
    public String dnaToRna(String dna) {
        return dna.replace('T', 'U');
    } 
}
```

## TypeScript
```ts
export function DNAtoRNA(dna: string): string {
  return dna.replace(/T/g, 'U')
}
```