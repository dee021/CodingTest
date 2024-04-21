import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
dp = [0 for _ in range(n)]
s = 0
for i in range(n-2, -1, -1):
    if arr[i] > arr[i+1]:
        s += 1
    dp[i] = s

for _ in range(int(input())):
    x, y = map(int, input().split())
    print(dp[x-1] - dp[y-1])

