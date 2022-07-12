import sys
from itertools import accumulate

n, m = map(int, sys.stdin.readline().split())

num = [0 for _ in range(n)]
for i in range(n):
    num[i] = list(accumulate(list(map(int, sys.stdin.readline().split()))))
    for j in range(n):
        if i == 0:
            break
        num[i][j] += num[i-1][j]

for _ in range(m):
    res = 0
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
    res = num[x2-1][y2-1]
    if x1 > 1:
        res -= num[x1-2][y2-1]
    if y1 > 1:
        res -= num[x2-1][y1-2]
    if x1 > 1 and y1 > 1:
        res += num[x1-2][y1-2]
    sys.stdout.write(str(res)+'\n')