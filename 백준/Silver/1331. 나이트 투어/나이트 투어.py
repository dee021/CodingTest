def sol(a, b):
    sr, sc = board[a]
    er, ec = board[b]
    # print(er, ec)
    if visited[er][ec]:
        return False
    if right != {abs(sr-er), abs(sc-ec)}:
        return False
    visited[er][ec] = 1
    return True

board = {chr(ord('A') + x) + str(y+1):[y,x] for x in range(6) for y in range(6)}
visited = [[0 for _ in range(6)] for _ in range(6)]

right = {1,2}
ans = 'Valid'

cur = input().strip()
start = cur
y, x = board[cur]
visited[y][x] = 1
for _ in range(35):
    post = input().strip()
    if not sol(cur, post):
        ans = 'Invalid'
        break
    cur = post
r, c = board[cur]
if right != {abs(y - r), abs(x - c)}:
    ans = 'Invalid'
print(ans)