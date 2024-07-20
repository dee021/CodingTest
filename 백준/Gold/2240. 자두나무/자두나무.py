import sys
input = sys.stdin.readline

t, w = map(int, input().split())
tree = []
l, cnt = 1,0
for _ in range(t):
    tmp = int(input())
    if tmp != l:
        tree.append(cnt)
        l = tmp
        cnt = 1
    else:
        cnt += 1
tree.append(cnt)

n = len(tree)
dp = [[0 for _ in range(w+1)] for _ in range(n)]

for r in range(n):
    for c in range(min(w+1, r+1)):
        if not c:
            dp[r][c] = dp[r-1][c]
            if r % 2 == 0:
                dp[r][c] += tree[r]
            continue
        dp[r][c] = max(dp[r-1][c], dp[r-1][c-1])
        if (r%2) == (c%2):
            dp[r][c] += tree[r]

print(max(dp[n-1]))