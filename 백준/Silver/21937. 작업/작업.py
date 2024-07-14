from collections import deque
import sys
input = sys.stdin.readline

def sol(node):
    ans = set()
    q = deque([node])
    while q:
        cur = q.popleft()
        for post in state[cur]:
            if post not in ans:
                ans.add(post)
                q.append(post)
    return len(ans)

n, m = map(int, input().split())
state = {x:[] for x in range(1, n+1)}
for _ in range(m):
    p, c = map(int, input().split())
    state[c].append(p)
print(sol(int(input())))