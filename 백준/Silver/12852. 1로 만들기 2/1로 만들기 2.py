from collections import deque

def sol():
    if n == 1:
        return 0
    q = deque([[1, 0]])
    while not dp[n]:
        k, cnt = q.popleft()
        for m in [k+1, k*2, k*3]:
            if m <= n and not dp[m]:
                dp[m] = k
                q.append([m, cnt +1])
    return cnt +1

n = int(input())
dp = [0 for _ in range(n+1)]
print(sol())
ans = []
while n >= 1:
    ans.append(n)
    n = dp[n]
print(*ans)