import sys
from collections import deque
input = sys.stdin.readline

def sol(node, dest):
    visited = set([node])
    q = deque([node])
    while q:
        cur = q.pop()
        for post in nodes[cur]:
            if post not in visited:
                q.append(post)
                visited.add(post)
                if post == dest:
                    return 'happy'
    return 'sad'
    


for _ in range(int(input())):
    n = int(input())
    s = [list(map(int, input().split()))] + [list(map(int, input().split())) for _ in range(n)] + [list(map(int, input().split()))]
    nodes = [[] for _ in range(n+2)]
    for i in range(n+2):
        x, y = s[i]
        for j in range(i+1, n+2):
            a, b = s[j]
            if abs(x-a) + abs(y-b) <= 1000:
                nodes[i].append(j)
                nodes[j].append(i)
    print(sol(0, n+1))