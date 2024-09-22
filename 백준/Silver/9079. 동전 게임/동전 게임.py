from collections import deque

def bfs(coins):
    if int(coins, 2) == 0 or int(coins, 2) == 511:
        return 0
    q = deque([[coins, 0]])
    visited[int(coins, 2)] = 1
    while q:
        cur, cnt = q.popleft()
        for i in range(3):
            rowconv = ''.join([cur[x] if x not in range(i*3, i*3+3) else str(int(cur[x])^1) for x in range(9)])
            colconv = ''.join([cur[x] if x not in range(i, 9, 3) else str(int(cur[x])^1) for x in range(9)])
            crossconv = ''.join([cur[x] if x not in [0,4,8] else str(int(cur[x])^1) for x in range(9)])
            arccrossconv = ''.join([cur[x] if x not in [2, 4, 6] else str(int(cur[x])^1) for x in range(9)])
            for post in [rowconv, colconv, crossconv, arccrossconv]:
                b_post = int(post, 2)
                if b_post == 0 or b_post == 511:
                    return cnt +1
                if not visited[b_post]:
                    visited[b_post] = 1
                    q.append([post, cnt +1])
    return -1

for _ in range(int(input())):
    visited = [0 for _ in range(1<<9)]
    coins = ''
    for _ in range(3):
        coins += input().strip().replace(' ','').replace('H', '1').replace('T', '0')
    print(bfs(coins))