https://www.codewars.com/kata/55e4c52ad58df7509c00007e

## JavaScript
```js
function validate(username, password){
  var database = new Database();
  return database.login(username, escape(password));
}
```

## Python
```py
def validate(username, password):
    database = Database()
    return database.login(username, password.replace('"','\\"'))
```