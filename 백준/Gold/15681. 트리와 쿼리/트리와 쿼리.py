import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def find(v):
    vertex[v] = 1
    for post in adj[v]:
        if not vertex[post]:
            vertex[v] += find(post)
    return vertex[v]

n, r, q = map(int, input().split())
adj = {x:[] for x in range(1, n+1)}
for _ in range(n-1):
    u, v = map(int, input().split())
    adj[u].append(v)
    adj[v].append(u)

vertex = [0 for _ in range(n+1)]
find(r)

ans = ''
for _ in range(q):
    ans += str(vertex[int(input())])+'\n'
print(ans)