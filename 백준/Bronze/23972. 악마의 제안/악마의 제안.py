import math

k, n = map(int, input().split())
if n == 1:
    ans = -1
else:
    ans = n*k//(n-1) + 1 if n*k%(n-1) else n*k//(n-1)
print(ans)