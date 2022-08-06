from functools import reduce

n, r = map(int, input().split())
r = min(r, n-r)
n = reduce(lambda x, y:x*y, [i for i in range(n, n-r, -1)])
r = reduce(lambda x, y:x*y, [i for i in range(r, 0, -1)])
print(n//r)