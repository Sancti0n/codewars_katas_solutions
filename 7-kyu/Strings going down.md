https://www.codewars.com/kata/6a784d563bfd7732517d9832

## Python
```py
def vertical(words):
    if not words:
        return ""
    max_len = max(len(w) for w in words) if words else 0
    if max_len == 0:
        return ""
    lines = []
    for k in range(max_len):
        row = []
        for word in words:
            char = word[k] if k < len(word) else " "
            row.append(char)
        lines.append(" ".join(row).rstrip())
    return "\n".join(lines)
```