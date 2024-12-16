n, m = map(int, input().split())
arr = list(map(int, input().split()))
frd = set(map(int, input().split()))
ans = 0
for i in range(m):
    if arr[i] not in frd:
        ans += 1

print(ans)