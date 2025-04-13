Complete the function so that it takes a collection of keys and a default value and returns a hash (Ruby) / dictionary (Python) / map (Scala) with all keys set to the default value.
Example

solution([:draft, :completed], 0) # should return {draft: 0, completed: 0}

## Python
```python
def populate_dict(keys, default):
    d = {}
    for i in keys:
        d[i] = default
    return d
```