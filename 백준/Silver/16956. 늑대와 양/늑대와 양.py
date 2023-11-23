import sys
input = sys.stdin.readline

def sol(u, v):
    for i in range(4):
        y, x = u + dy[i], v + dx[i]
        if 0 <= y < r and 0 <= x < c and arr[y][x] == 'S':
            return 1
    return 0

dy, dx = [0,0,1,-1], [1,-1,0,0]
r, c = map(int, input().split())
arr = [list(input().strip().replace('.','D')) for _ in range(r)]
for i in range(r):
    for j in range(c):
        if arr[i][j] == 'W':
            res = sol(i, j)
            if res:
                print(0)
                exit(0)
print(1)
for i in range(r):
    print(''.join(arr[i]))