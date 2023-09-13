from collections import deque

def sol():
    q = deque([[1,0]])
    while q:
        l, c = q.popleft()
        for i in range(1,7):
            if l+i <= 100 and not visit[board[l+i]]:
                if board[l+i] == 100:
                    return c+1
                visit[board[l+1]] = 1
                q.append([board[l+i], c+1])

board = [x for x in range(101)]
visit = [0 for _ in range(101)]
n, m = map(int, input().split())
for _ in range(n+m):
    a, b = map(int, input().split())
    board[a] = b
print(sol())