from functools import reduce
n = int(input())
print(reduce(lambda x, y:x*y, [x for x in range(n) if x%2])%(10**9+7))