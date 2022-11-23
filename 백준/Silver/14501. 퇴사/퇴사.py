import sys
# input = sys.stdin.readline

n = int(input())
t = []
p = []

for d in range(n):
    tt, tp = map(int, input().split())
    if d + tt > n: # 시간상 상담이 불가능한 경우
        tt, tp = 1, 0
    t.append(tt)
    p.append(tp)

dp = [0 for _ in range(n)]
dp[0] = p[n-1]
for rd in range(1,n): # 뒤에서 부터 계산
    tt = t[n-rd-1]
    dp[rd] = max(dp[rd-1], dp[rd-tt] + p[n-rd-1])
print(dp[n-1])