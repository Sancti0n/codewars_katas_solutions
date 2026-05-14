https://www.codewars.com/kata/514a677421607afc99000002

## JavaScript
```js
function getNames(data){
  return data.map(function(item){return item.name});
}
```

## Python
```py
def itemgetter(item):
    return item['name']
    
def get_names(data):
    return list(map(itemgetter, data))
```