import sys
input = sys.stdin.readline

n, c, w = map(int, input().strip().split())
arr = [int(input().strip()) for _ in range(n)]
ans = [0 for _ in range(max(arr))]

for i in range(n):
    for j in range(1, arr[i]+1):
        p = arr[i]//j*j*w
        m = (arr[i]//j - (0 if arr[i]%j else 1))*c
        if p > m:
            ans[j-1] += p-m
print(max(ans))