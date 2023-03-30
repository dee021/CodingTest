from functools import reduce

ans = [0]*10
arr = [int(input()) for _ in range(3)]

for n in str(reduce(lambda x, y: x*y, arr)):
    ans[int(n)] += 1
print(*ans, sep='\n')