https://www.codewars.com/kata/554e4a2f232cdd87d9000038

## Python
```python
def DNA_strand(dna):
    w = ''
    for i in range(len(dna)):
        if dna[i] == 'A': w += 'T'
        elif dna[i] == 'T': w += 'A'
        elif dna[i] == 'G': w += 'C'
        elif dna[i] == 'C': w += 'G'
    return w
```

## JavaScript
```js
function DNAStrand(dna){
  let pairs = {'A':'T','T':'A','C':'G','G':'C'};
  let w = '';
  for (let i=0;i<dna.length;i++) {
    w += pairs[dna[i]];
  }
  return w
}
```

## PHP
```php
function DNA_strand($dna) {
  $w = '';
  for ($i=0;$i<strlen($dna);$i++) {
    if ($dna[$i] == 'A') $w .= 'T';
    else if ($dna[$i] == 'T') $w .= 'A';
    else if ($dna[$i] == 'G') $w .= 'C';
    else if ($dna[$i] == 'C') $w .= 'G';
  }
  return $w;
}
```

## Java
```java
public class DnaStrand {
  public static String makeComplement(String dna) {
    String w = "";
    String v[] = dna.split("");
    for (int i=0;i<v.length;i++) {
      if (v[i].equals("A")) w += "T";
      else if (v[i].equals("T")) w += "A";
      else if (v[i].equals("G")) w += "C";
      else if (v[i].equals("C")) w += "G";
    }
    return w;
  }
}
```