import sys
input = sys.stdin.readline

M = 1_000_000_007
n = int(input())
arr = list(map(int, input().split()))
ans = 0
s = sum(arr)

for k in arr:
    s -= k
    ans += k*s
    ans %= M
print(ans)