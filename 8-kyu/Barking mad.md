https://www.codewars.com/kata/54dba07f03e88a4cec000caf

## JavaScript
```js
function Dog (breed) {
  this.breed = breed;
}

var snoopy = new Dog("Beagle");

Dog.prototype.bark = function() {
  return "Woof";
};

var scoobydoo = new Dog("Great Dane");
```

## Python
```py
class Dog():
    def __init__(self, breed):
        self.breed = breed
    def bark(self):
        return "Woof"

snoopy = Dog("Beagle")
scoobydoo = Dog("Great Dane")
```