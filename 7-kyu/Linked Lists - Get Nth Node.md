https://www.codewars.com/kata/55befc42bfe4d13ab1000007

## JavaScript
```js
function Node(data) {
  this.data = data;
  this.next = null;
}

function getNth(node, index) {
  if (node == null) {
      throw new Error("Null linked list should throw error.");
  }
  let c = 0;
  while (c<index) {
    node = node.next;
    if (node == null) {
      throw new Error("Invalid index value should throw error.");
    }
    c++;
  }
  return node
}
```

## Python
```python
def get_nth(node, index):
    e = "Null linked list should throw error."
    if node == None or index<0:
        raise TypeError(e) 
    c = 0
    while c<index:
        node = node.next
        if node == None:
            raise TypeError(e)
        c += 1
    return node
```