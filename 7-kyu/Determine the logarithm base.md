https://www.codewars.com/kata/5ae1dcde9c0e489ae00019fc

## Python
```py
def determine_base(log_func):
    return 30**(1/log_func(30))
```

## JavaScript
```js
function determineBase(logFunc){
  return 30**(1/logFunc(30))
}
```

## C++
```c++
#include <functional>
#include <cmath>

double DetermineBase(std::function<double(double)> log_function) {
  return pow(30, 1/log_function(30));
}
```