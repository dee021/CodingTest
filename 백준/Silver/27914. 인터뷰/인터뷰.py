import sys
input = sys.stdin.readline

n, k, q = map(int, input().split())
grade = list(map(int, input().split()))

dp = [0 for _ in range(n)]
l = 0
if grade[0] != k:
    dp[0] = 1;l = 1

for i in range(1, n):
    if grade[i] == k:
        l = 0
    else:
        l += 1
    dp[i] = dp[i-1] + l

for x in map(int, input().split()):
    print(dp[x-1])