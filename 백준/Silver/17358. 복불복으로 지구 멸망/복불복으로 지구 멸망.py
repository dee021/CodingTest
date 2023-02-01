from functools import reduce
n = int(input())
print(reduce(lambda x, y:x*y%1000000007, [x for x in range(n) if x%2]))