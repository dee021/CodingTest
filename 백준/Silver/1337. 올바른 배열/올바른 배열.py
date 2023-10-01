n = int(input())
arr = set([int(input()) for _ in range(n)])
ans = 0
for k in arr:
    cnt = len(set(range(k, k+5)) & arr)
    ans = max(ans, cnt)
print(5-ans)