import sys
sys.setrecursionlimit(10**7)

v, e = map(int, sys.stdin.readline().split())

graph = [[0 for _ in range(v)] for _ in range(v)]
cnt = 0

def isol(x): # 고립 노드 count
    global cnt, graph
    if graph[x].count(1) == 0:
        cnt += 1

def bfs(x, g):
    def mapbfs(idx):
        return bfs(idx, g)
    if g[x].count(1) == 0:
        return 0
    conn = []
    for i in range(v):
        if g[x][i] == 1:
            conn.append(i)
            g[x][i] = g[i][x] = 0
    list(map(mapbfs, conn)) # 연결된 정점은 count 제외
    return 1

for i in range(e): # 간선 표시
    x, y = map(int, sys.stdin.readline().split())

    graph[x-1][y-1] = graph[y-1][x-1] = 1

list(map(isol, list([x for x in range(v)])))

for i in range(v):
    cnt += bfs(i, graph)
print(cnt)
