from itertools import permutations as pt

n, k = map(int, input().split())
lst = list(map(int, input().split()))
ans = 0

for o in list(pt(range(n))):
    w = 500
    for i in range(n):
        w += lst[o[i]] - k
        if w < 500:
            break
        if i == n-1:
            ans += 1
print(ans)