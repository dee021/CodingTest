from functools import reduce

n, m = map(int, input().split())
arr = [x%m for x in map(int, input().split())]
print(reduce(lambda x, y:x*y, arr)%m)