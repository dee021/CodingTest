from collections import deque
import sys
input = sys.stdin.readline

def sol():
    q = deque([[abs(min_x), abs(min_y)]])
    board[abs(min_y)][abs(min_x)] = 0
    while q:
        x, y = q.popleft()
        for dx, dy in dr:
            a, b = x + dx, y + dy
            if 0 <= a < w and 0 <= b < h and board[b][a] == -1:
                if a == end_x and b == end_y:
                    return board[y][x] +1
                board[b][a] = board[y][x] +1
                q.append([a, b])
                

dr = [[0,1], [0,-1], [1,0], [-1,0]]
arr = []
end_x, end_y, n = map(int, input().split())
max_x, max_y, min_x, min_y = end_x+1, end_y+1, end_x-1, end_y-1
for _ in range(n):
    a, b = map(int, input().split()) # col, row
    arr.append([a, b])
    max_x, min_x = max(max_x, a+1), min(min_x, a-1)
    max_y, min_y = max(max_y, b+1), min(min_y, b-1)
board = [[-1 for _ in range(min_x, max_x+1)] for _ in range(min_y, max_y+1)]
for _ in range(n):
    a, b = arr.pop()
    board[b - min_y][a - min_x] = -2
w, h = len(board[0]), len(board)
end_x -= min_x; end_y -= min_y
print(sol())