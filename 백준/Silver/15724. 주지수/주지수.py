import sys
input = sys.stdin.readline

def sol(r1, c1, r2, c2):
    ans = calArr[r2][c2]
    if r1:
        ans -= calArr[r1-1][c2]
    if c1:
        ans -= calArr[r2][c1-1]
    if r1 and c1:
        ans += calArr[r1-1][c1-1]
    return ans

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
calArr = [[0 for _ in range(m)] for _ in range(n)]

for r in range(n):
    for c in range(m):
        calArr[r][c] = arr[r][c]
        if r:
            calArr[r][c] += calArr[r-1][c]
        if c:
            calArr[r][c] += calArr[r][c-1]
        if r and c:
            calArr[r][c] -= calArr[r-1][c-1]

for _ in range(int(input())):
    r1, c1, r2, c2 = map(lambda x:int(x)-1, input().split())
    print(sol(r1,c1,r2,c2))