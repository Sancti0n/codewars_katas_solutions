https://www.codewars.com/kata/57613fb1033d766171000d60

## Python
```py
def uefa_euro_2016(t, s):
    if s[0] == s[1]: return 'At match '+t[0]+' - '+t[1]+ ', teams played draw.'
    return 'At match '+t[0]+' - '+t[1]+ ', ' +t[s.index(max(s))]+' won!'
```

## JavaScript
```js
function uefaEuro2016(t, s) {
  if (s[0] == s[1]) return 'At match '+t[0]+' - '+t[1]+ ', teams played draw.'
  return 'At match '+t[0]+' - '+t[1]+ ', ' +t[s.indexOf(Math.max(...s))]+' won!'
}
```