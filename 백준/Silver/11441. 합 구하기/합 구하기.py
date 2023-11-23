import sys
input = sys.stdin.readline

n = int(input())
dp = [0 for _ in range(n+1)]
for i, k in enumerate(list(map(int, input().split())), 1):
    dp[i] = dp[i-1] + k
for _ in range(int(input())):
    s, e = map(int, input().split())
    print(dp[e] - dp[s-1])