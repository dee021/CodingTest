from functools import reduce

f = 0
n = list(map(int, input()))
a, b = 1, reduce(lambda x, y: x*y, n)
try:
    for i in range(len(n)-1):
        a *= n[i]; b //= n[i]
        if a == b:
            f = 1
            break
except:
    if n.count(0) -1:
        f = 1
print(f and 'YES' or 'NO')