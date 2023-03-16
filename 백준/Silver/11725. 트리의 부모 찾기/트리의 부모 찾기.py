import sys
input = sys.stdin.readline
from collections import deque

def edge(x, y):
    node[x].add(y)
    node[y].add(x)

def tree(q = deque([(1,1)])):
    while q:
        idx, parent = q.popleft()
        node[idx].discard(1)
        if ans[idx]:
            continue
        q.extend([(x, idx) for x in node[idx]])
        ans[idx] = parent
        
    

n = int(input())
node = [set() for _ in range(n+1)]
ans = [0 for _ in range(n+1)]
for _ in range(n-1):
    edge(*map(int, input().split()))
tree()
print(*ans[2:], sep='\n')
