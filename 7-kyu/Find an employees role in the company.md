https://www.codewars.com/kata/55c9fb1b407024afe6000055

## Python
```py
def find_employees_role(name):
    m = "Does not work here!"
    if " " not in name: return m
    f, l = [name.split(" ")[0], name.split(" ")[1]]
    for i in employees:
        if i['first_name'] == f and i['last_name'] == l: return i['role']
    return m
```

## JavaScript
```js
function findEmployeesRole(name) {
  let m = "Does not work here!";
  if (name.indexOf(" ")<0) return m
  let f = name.split(" ")[0], l = name.split(" ")[1];
  for (let i=0;i<employees.length;i++) {
    if (employees[i]['firstName'] == f && employees[i]['lastName'] == l) return employees[i]['role']
  }
  return m
}
```