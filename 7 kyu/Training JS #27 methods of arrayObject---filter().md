https://www.codewars.com/kata/573023c81add650b84000429

## JavaScript
```js
function countGrade(scores) {
  let d = {"S":0, "A":0, "B":0, "C":0, "D":0, "X":0};
  for (let i=0;i<scores.length;i++) {
    if (scores[i] == 100) d["S"]++;
    else if (scores[i]>=90 && scores[i]<100) d["A"]++;
    else if (scores[i]>=80 && scores[i]<90) d["B"]++;
    else if (scores[i]>=60 && scores[i]<80) d["C"]++;
    else if (scores[i]>=0 && scores[i]<60) d["D"]++;
    else if (scores[i]<0) d["X"]++;
  }
  return d
}
```