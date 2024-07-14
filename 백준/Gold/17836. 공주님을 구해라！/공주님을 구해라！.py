from collections import deque
import sys
input = sys.stdin.readline

def sol():
    global ans
    if arr[0][0] == 2:
        ans = n+m-2
        return
    q = deque([[0, 0, 0]])
    arr[0][0] = 1
    while q:
        y, x, s = q.popleft()
        for dy, dx in dr:
            r, c = y + dy, x + dx
            if 0 <= r < n and 0 <= c < m and arr[r][c] != 1:
                if r == n-1 and c == m-1:
                    ans = min(ans, s+1)
                    return 
                elif arr[r][c] == 2:
                    ans = s + n-r + m-c -1
                q.append([r, c, s+1])
                arr[r][c] = 1
    return 

dr = [[0,1], [0,-1], [1,0], [-1,0]]
n, m, t = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
ans = float('inf')
sol()
if ans == float('inf') or ans > t:
    print('Fail')
else:
    print(ans)