def thirt(n):
    t = [1,10,9,12,3,4]
    w = str(n)[::-1]
    s = sum([int(w[i])*t[i%6] for i in range(len(w))])
    temp = 0
    while s != temp:
        temp = s
        s = str(s)[::-1]
        s = sum([int(s[i])*t[i%6] for i in range(len(s))])
    return s