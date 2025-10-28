https://www.codewars.com/kata/567b468357ed7411be00004a

## JavaScript
```js
const mapPopulationFit = (population, fitness) => {
  return population.map(a => {
    return {chromosome:a,fitness:fitness(a)}
  })
};
```