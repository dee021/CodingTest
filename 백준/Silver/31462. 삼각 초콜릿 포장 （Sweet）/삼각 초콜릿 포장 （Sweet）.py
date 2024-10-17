import sys
input = sys.stdin.readline

def check(y, x):
    candy = color[y][x]
    dr = candy == 'R' and red or blue
    for dy, dx in dr:
        r, c = y + dy, x + dx
        if r < n and 0 <= c < r+1 and color[r][c] == candy and visited[r][c] == 0:
            visited[r][c] = 1
        else:
            return False
    return True

def sol():
    for r in range(n):
        for c in range(r+1):
            if visited[r][c] == 0:
                res = check(r, c)
                if not res:
                    return 0
    return 1

red = [[0,0], [1, 0], [1,1]]
blue = [[0,0], [0, 1], [1, 1]]
n = int(input())
color = [input().strip() for _ in range(n)]
visited = [[0 for _ in range(x+1)] for x in range(n) ]
print(sol())