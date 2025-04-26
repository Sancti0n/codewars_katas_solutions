https://www.codewars.com/kata/54fdaa4a50f167b5c000005f

## Python
```python
def get_status(*is_busy):
    msg = "busy" if is_busy[0] else "available"
    return {"status":msg}
```

## JavaScript
```js
function getStatus(isBusy) {
  var msg = (isBusy ? "busy" : "available");
  return { status: msg }
}
```