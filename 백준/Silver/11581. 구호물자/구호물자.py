import sys
input = sys.stdin.readline

def dfs(node = 1):
    if node == n:
        return True
    for post in edge[node]:
        if visited[post]:
            return False
        visited[post] = 1
        res = dfs(post)
        visited[post] = 0
        if not res:
            return False
    return True
    
n = int(input())
edge = {x:[] for x in range(1, n)}
visited = [0 for _ in range(n+1)]
for node in range(1, n):
    input()
    for other in list(map(int, input().split())):
        edge[node].append(other)

visited[1] = 1
print(dfs() and 'NO CYCLE' or 'CYCLE')