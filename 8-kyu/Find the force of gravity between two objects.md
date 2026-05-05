https://www.codewars.com/kata/5b609ebc8f47bd595e000627

## Python
```py
def solution(arr_val, arr_unit):
    G = 6.67e-11
    conversions = {
        "kg": 1,
        "g": 1e-3,
        "mg": 1e-6,
        "μg": 1e-9,
        "lb": 0.453592,
        "m": 1,
        "cm": 1e-2,
        "mm": 1e-3,
        "μm": 1e-6,
        "ft": 0.3048
    }
    
    m1 = arr_val[0] * conversions[arr_unit[0]]
    m2 = arr_val[1] * conversions[arr_unit[1]]
    r = arr_val[2] * conversions[arr_unit[2]]
    
    return (G * m1 * m2) / (r*r)
```

## JavaScript
```js
let solution = (arr_val, arr_unit) => {
  let conversions = {
    "kg": 1,
    "g": 1e-3,
    "mg": 1e-6,
    "μg": 1e-9,
    "lb": 0.453592,
    "m": 1,
    "cm": 1e-2,
    "mm": 1e-3,
    "μm": 1e-6,
    "ft": 0.3048,
    "G": 6.67e-11
  };
  
  let m1 = arr_val[0] * conversions[arr_unit[0]];
  let m2 = arr_val[1] * conversions[arr_unit[1]];
  let r = arr_val[2] * conversions[arr_unit[2]];
  
  return (conversions["G"] * m1 * m2) / (r * r);
};
```