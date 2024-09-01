from collections import deque
import sys
input = sys.stdin.readline

def sol(r, c):
    q = deque([[r, c, 0]])
    arr[r][c] = -1
    while q:
        y, x, cnt = q.popleft()
        for dy, dx in dr:
            r, c = y + dy, x + dx
            if 0 <= r < 5 and 0 <= c < 5 and arr[r][c] != -1:
                if arr[r][c] == 1:
                    return cnt +1
                q.append([r, c, cnt+1])
                arr[r][c] = -1
    return -1

dr = [[0,1], [0,-1], [1,0], [-1,0]]
arr = [list(map(int, input().split())) for _ in range(5)]
print(sol(*map(int, input().split())))