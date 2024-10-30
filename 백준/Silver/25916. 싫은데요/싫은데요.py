import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = list(map(int, input().split()))

start = 0
s = 0
ans = 0
for end in range(n):
    s += arr[end]
    while s > m:
        s -= arr[start]
        start += 1
    ans = max(ans, s)
print(ans)