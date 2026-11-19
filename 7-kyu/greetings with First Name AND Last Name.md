https://www.codewars.com/kata/54582f970a80d2ca46000f25

## Python
```py
class Person:
    def __init__(self, a, b):
        self.__a = a
        self.__b = b
        
    def greet(self):
        return "Hello, {} {}!".format(self.__a, self.__b)
```