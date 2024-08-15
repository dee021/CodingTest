import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = list(map(int, input().split()))
s = sum(arr[:m])
ans = s

for i in range(m, n):
    s += arr[i] - arr[i-m]
    ans = max(ans, s)
print(ans)