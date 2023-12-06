import sys
input = sys.stdin.readline

def sol(r1, c1, r2, c2):
    s = 0
    for r in range(r1-1, r2):
        s += photo[r][c2-1]
        if c1 -1 :
            s -= photo[r][c1-2]
    return s//((c2-c1+1)*(r2-r1+1))


n, m, q = map(int, input().split())
photo = [list(map(int, input().split())) for _ in range(n)]
for r in range(n):
    for c in range(1, m):
        photo[r][c] += photo[r][c-1]

for _ in range(q):
    print(sol(*map(int, input().split())))