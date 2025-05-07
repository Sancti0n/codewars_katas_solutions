https://www.codewars.com/kata/65128d27a5de2b3539408d83

## Python
```python
def win_round(you, opp):
    you.sort()
    opp.sort()
    return int(str(you[len(you)-1])+str(you[len(you)-2]))>int(str(opp[len(opp)-1])+str(opp[len(opp)-2]))
```