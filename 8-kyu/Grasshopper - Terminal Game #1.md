https://www.codewars.com/kata/55e8aba23d399a59500000ce

## JavaScript
```js
class Hero {
  constructor(name = "Hero") {
    this.name = name,
    this.position = "00",
    this.health = 100,
    this.damage = 5,
    this.experience = 0
  }
}
```

## Python
```py
class Hero(object):
    def __init__(self, name = "Hero"):
        self.name = name
        self.position = "00"
        self.health = 100
        self.damage = 5
        self.experience = 0
```

## PHP
```php
class Hero {
  public $name;
  public $position;
  public $health;
  public $damage;
  public $experience;

  public function __construct($name = "Hero", $position = "00", $health = 100, $damage = 5, $experience = 0) {
    $this->name = $name;
    $this->position = $position;
    $this->health = $health;
    $this->damage = $damage;
    $this->experience = $experience;
  }
}
```

## Java
```java
public class Hero {
  String name;
  String position;
  int health;
  int damage;
  int experience;
  
  public Hero() {
    this.name = "Hero";
    this.position = "00";
    this.health = 100;
    this.damage = 5;
    this.experience = 0;
  }
  
  public Hero(String name) {
    this.name = name;
    this.position = "00";
    this.health = 100;
    this.damage = 5;
    this.experience = 0;
  }
}
```