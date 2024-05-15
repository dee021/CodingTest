n, m = map(int, input().split())
ans = 0
arr = sorted(map(int, input().split()), key = lambda x:(x%10, x))

for i in range(n):
    if arr[i] == 10:
        ans += 1
        continue
    if m == 0:
        break
    if arr[i] < 10:
        continue
    if arr[i]//10 - (arr[i]%10 == 0) <= m:
        ans += arr[i]//10
        m -= arr[i]//10 - (arr[i]%10 == 0)
    else:
        ans += m
        m = 0
print(ans)