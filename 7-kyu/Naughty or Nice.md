https://www.codewars.com/kata/52a6b34e43c2484ac10000cd

## JavaScript
```js
function getNiceNames(people) {
  let t = [];
  for (let i=0;i<people.length;i++) {
    if (people[i].wasNice) t.push(people[i].name);
  }
  return t
}

function getNaughtyNames(people){
  let t = [];
  for (let i=0;i<people.length;i++) {
    if (!people[i].wasNice) t.push(people[i].name);
  }
  return t
}
```

## Python
```py
def get_nice_names(people):
    return [i["name"] for i in people if i["was_nice"]]

def get_naughty_names(people):
    return [i["name"] for i in people if not i["was_nice"]]
```