https://www.codewars.com/kata/563089b9b7be03472d00002b

## JavaScript
```js
Array.prototype.remove_ = function(integer_list, values_list){
  let t = []
  for (let i=0;i<integer_list.length;i++) {
    if (values_list.indexOf(integer_list[i]) === -1) t.push(integer_list[i])
  }
  return t
}
```

## Python
```python
class List:
    def remove_(self, integer_list, values_list):
        t = []
        for i in range(len(integer_list)):
            if not integer_list[i] in values_list: t.append(integer_list[i])
        return t
```