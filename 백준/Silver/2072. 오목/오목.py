import sys
input = sys.stdin.readline

def slicing(lst):
    if len(lst) < 5:
        return float('inf')
    elif len(lst) == 5:
        return max(lst)
    idx = lst.index(max(lst))
    return min(slicing(lst[:idx]), slicing(lst[idx+1:]))

def check(y, x, i):
    res = []
    color = board[y][x] % 2
    dy, dx = dr[i]
    tmp = []
    r, c = y, x
    while 0 < r <= 19 and 0 < c <= 19 and board[r][c] != -1 and board[r][c] % 2 == color:
        visited[r][c] = 1
        tmp.append(board[r][c])
        r += dy; c += dx
    v = slicing(tmp)
    if v != float('inf'):
        res.append(v)
    if res:
        return res
    return -1

board = [[-1 for _ in range(20)] for _ in range(20)]
dr = [[0,1], [1,0], [1,1], [1,-1]]
ans = []

for i in range(int(input())):
    r, c = map(int, input().split())
    board[r][c] = i+1

for i in range(4):
    visited = [[0 for _ in range(20)] for _ in range(20)]
    for r in range(1, 20):
        for c in range(1, 20):
            if board[r][c] > 0 and visited[r][c] == 0:
                res = check(r, c, i)
                if res != -1:
                    ans.extend(res)

print(ans and min(ans) or -1)