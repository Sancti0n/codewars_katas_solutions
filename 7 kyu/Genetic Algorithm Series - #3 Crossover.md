https://www.codewars.com/kata/567d71b93f8a50f461000019

## Python
```python
def crossover(chromosome1, chromosome2, index):
    return [chromosome1[:index]+chromosome2[index:], chromosome2[:index]+chromosome1[index:]]
```

## JavaScript
```js
const crossover = (chromosome1, chromosome2, index) => {
  return [chromosome1.slice(0, index)+chromosome2.slice(index), chromosome2.slice(0, index)+chromosome1.slice(index)]
};
```

## PHP
```php
function crossover($chromosome1, $chromosome2, $index) {
  return [substr($chromosome1, 0, $index) . substr($chromosome2, $index), substr($chromosome2, 0, $index) . substr($chromosome1, $index)];
}
```