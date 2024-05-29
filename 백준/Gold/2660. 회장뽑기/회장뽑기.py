n = int(input())
dis = [[float('inf') for _ in range(n)] for _ in range(n)]

while True:
    a, b = map(int, input().split())
    if a == -1 == b:
        break
    dis[a-1][b-1] = dis[b-1][a-1] = 1

for i in range(n):
    dis[i][i] = 0
    for j in range(n):
        if i == j:
            continue
        for k in range(n):
            if k in [i, j]:
                continue
            dis[i][k] = dis[k][i] = min(dis[i][k], dis[i][j] + dis[j][k])

ans = float('inf')
score = [0 for _ in range(n)]
for i in range(n):
    score[i] = max(dis[i])
    ans = min(ans, score[i])
score = [x+1 for x in range(n) if score[x] == ans]
print(ans, len(score))
print(*score)