https://www.codewars.com/kata/528d36d7cc451cd7e4000339

## JavaScript
```js
function mostMoney(students) {
  let tname = [], tvalue = [], c = 0;
  for (let i=0;i<students.length;i++) {
    tname.push(students[i]["name"]);
    tvalue.push(students[i]["fives"]*5 + students[i]["tens"]*10 + students[i]["twenties"]*20);
  }
  for (let j=1;j<tvalue.length;j++) {
    if (tvalue[j-1] == tvalue[j]) c++;
    if (c + 1 == tvalue.length) return "all"
  }
  return tname[tvalue.indexOf(Math.max(...tvalue))]
}
```

## Python
```py
def most_money(students):
    tname = []
    tvalue = []
    for i in students:
        tname.append(i.name)
        tvalue.append(i.fives*5 + i.tens*10 + i.twenties*20)
    if len(tvalue)>1 and tvalue == [max(tvalue)]*len(tvalue): return "all"
    return tname[tvalue.index(max(tvalue))]
```