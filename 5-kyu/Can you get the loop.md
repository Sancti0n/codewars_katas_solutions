https://www.codewars.com/kata/52a89c2ea8ddc5547a000863

## Python
```py
def loop_size(node):
    slow, fast = [node, node]
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            c = 0
            current = slow.next
            c = 1
            while current != slow:
                current = current.next
                c += 1
            return c
    return 0
```