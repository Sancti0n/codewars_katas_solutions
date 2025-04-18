https://www.codewars.com/kata/561bbcb0fbbfb0f5010000ee

## Python
```python
def longest_possible(playback):
    m, s = [0, ""]
    for i in songs:
        d = i["playback"].split(":")
        d = int(d[0])*60 + int(d[1])
        if d>m and d<=playback:
            m = d
            s = i["title"]
    return s if s else False
```

## JavaScript
```js
function longestPossible(playback) {
  let m = 0, s = "", d = "";
  for (let i=0;i<songs.length;i++) {
    d = songs[i]["playback"].split(":");
    d = parseInt(d[0])*60 + parseInt(d[1]);
    if (d>m && d<=playback) {
      m = d;
      s = songs[i]["title"];
    }
  }
  return s ? s : false
}
```