https://www.codewars.com/kata/69626db5a27d1aa35aeec789

## Python
```py
def monkeys():
    a=" little monkeys jumping on the bed,\nOne fell off and bumped his head.\nMother called the doctor and the doctor said:\nNo more monkeys jumping on the bed!\n\n"
    t,s=["Five","Four","Three","Two"],""
    for i in range(4):s+=t[i]+a
    return s+"One little monkey jumping on the bed,\nHe fell off and bumped his head.\nMother called the doctor and the doctor said:\nPut those monkeys right to bed!"
```