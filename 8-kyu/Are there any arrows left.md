https://www.codewars.com/kata/559f860f8c0d6c7784000119

## Python
```py
def any_arrows(arrows):
    if len(arrows)<1:
        return False
    for i in arrows:
        if "damaged" not in i or i["damaged"] == False:
            return True
    return False
```

## JavaScript
```js
function anyArrows(arrows) {
  if (arrows.length<1) {
    return false;
  }
  for (let i=0;i<arrows.length;i++) {
    if (!("damaged" in arrows[i]) || arrows[i].damaged == false) {
      return true;
    }
  }
  return false;
}
```