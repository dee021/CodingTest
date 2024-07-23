n, m = map(int, input().split())
arr = list(map(int, input().split()))

start, s, ans = 0, 0, 0
for end in range(n):
    s += arr[end]
    while s > m:
        s -= arr[start]
        start += 1
    if s == m:
        ans += 1
print(ans)