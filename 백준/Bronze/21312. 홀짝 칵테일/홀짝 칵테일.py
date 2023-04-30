from functools import reduce
a, b, c = map(int, input().split())
arr = [x for x in [a, b, c] if x%2]

if arr:
    print(reduce(lambda x, y: x*y, arr))
else:
    print(a*b*c)