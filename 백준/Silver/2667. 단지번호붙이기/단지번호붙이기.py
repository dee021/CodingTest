dx, dy = [0,0,1,-1], [1,-1,0,0]

def sol(r, c):
    if 0 <= r < n and 0 <= c < n:
        if arr[r][c] == 1:
            cnt = 1
            arr[r][c] = 0
            for i in range(4):
                cnt += sol(r+dx[i], c+dy[i])
            return cnt
    return 0

n = int(input())
arr = [list(map(int, input())) for _ in range(n)]
ans = []

for r in range(n):
    for c in range(n):
        if arr[r][c] == 1:
            ans.append(sol(r, c))
print(len(ans), *sorted(ans), sep='\n')