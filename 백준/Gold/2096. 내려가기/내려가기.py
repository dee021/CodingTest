def sol(r):
    tmp = [[0,0,0] for _ in range(2)]
    for c in range(3):
        tmp[0][c] = arr[r+1][c] + min(ans[0][max(0, c-1):min(3, c+2)])
        tmp[1][c] = arr[r+1][c] + max(ans[1][max(0, c-1):min(3, c+2)])
    return tmp

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
ans = [arr[0].copy() for _ in range(2)]
for r in range(n-1):
    ans = sol(r)
print(max(ans[1]), min(ans[0]))