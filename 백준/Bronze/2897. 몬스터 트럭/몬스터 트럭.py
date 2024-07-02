import sys
input = sys.stdin.readline

def sol(x, y):
    cnt = 0
    for dx, dy in dr:
        c, r = x + dx, y + dy
        if 0 <= c < m and 0 <= r < n:
            if arr[r][c] == '#':
                return 5
            elif arr[r][c] == 'X':
                cnt += 1
    return cnt

dr = [[0,0], [0,1], [1,0], [1, 1]]
ans = [0 for _ in range(6)]
n, m = map(int, input().split())
arr = [list(input().strip()) for _ in range(n)]

for r in range(n-1):
    for c in range(m-1):
        ans[sol(c, r)] += 1
print(*ans[:-1], sep='\n')