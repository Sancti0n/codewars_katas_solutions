https://www.codewars.com/kata/6a2c623fb42a4ee098b2c36b

## Python
```py
def evaluate_polynomial(coefficients: list[int], x: int) -> int:
    result = 0
    for coef in coefficients:
        result = result * x + coef
    return result
```