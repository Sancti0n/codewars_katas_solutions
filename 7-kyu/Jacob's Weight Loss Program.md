https://www.codewars.com/kata/573b216f5328ffcd710013b3

## JavaScript
```js
function loseWeight(gender, weight, duration) {
  if (["M", "F"].indexOf(gender)<0) return "Invalid gender"
  if (weight<=0) return "Invalid weight"
  if (duration<=0) return "Invalid duration"
  let i = 0;
  let r = gender == "M" ? .985 : .988
  while (i<duration) {
    weight *= r;
    i++;
  }
  return Math.round(weight*10)/10
}
```

## Python
```py
def lose_weight(gender, weight, duration):
    if gender != "M" and gender != "F": return "Invalid gender"
    if weight<=0: return "Invalid weight"
    if duration<=0: return "Invalid duration"
    i, r = 0, .985 if gender == "M" else .988
    while i<duration:
        weight *= r
        i += 1
    return round(weight, 1)
```