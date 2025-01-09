import sys
input = sys.stdin.readline

n = int(input())
arr = sorted(map(int, input().split()))
ans, idx = 0, 0
for k in range(0, n+1):
    while idx < n and arr[idx] < k:
        idx += 1
    if idx > k or n-idx < k:
        break
    ans = k
print(ans)