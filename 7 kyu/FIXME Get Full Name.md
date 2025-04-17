https://www.codewars.com/kata/597c684822bc9388f600010f

## Python
```python
class Dinglemouse(object):
    def __init__(self, first_name, last_name):
        self.first_name = first_name
        self.last_name = last_name
    def get_full_name(self):
        if self.last_name == "": return self.first_name
        if self.first_name == "": return self.last_name
        return self.first_name + ' ' + self.last_name
```

## JavaScript
```js
class Dinglemouse{
  constructor(firstName, lastName ){
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  getFullName(){
    if (this.firstName == "") return this.lastName
    if (this.lastName == "") return this.firstName
    return this.firstName+" "+this.lastName
  }
}
```

## PHP
```php
class Dinglemouse {
  public function __construct($firstName, $lastName) {
    $this->firstName = $firstName;
    $this->lastName = $lastName;
  }
  
  public function getFullName() {
    if ($this->firstName == "") {
      return $this->lastName;
    }
    if ($this->lastName == "") {
      return $this->firstName;
    }
    return $this->firstName. " " .$this->lastName;
  }
}
```