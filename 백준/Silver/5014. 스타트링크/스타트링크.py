from collections import deque

def sol():
    if (s < g and u == 0) or (s > g and d == 0):
        return 'use the stairs'

    visited = [0 for _ in range(f+1)]
    for i in range(s, g+(1 if s <= g else -1), u if s <= g else d):
        visited[i] = 1
        
    dist = abs(g-s)
    ans, cur = 0, s
    if s < g:
        ans += dist // u
        cur = s + dist - (dist%u)
    elif s > g:
        ans += dist // d
        cur = s - dist + (dist%d)

    if cur == g:
        return ans
    
    q = deque([[cur, 0]])
    while q:
        cur, cnt = q.popleft()
        for i in [u, -d]:
            post = cur + i
            if 1 <= post <= f and visited[post] == 0:
                if post == g:
                    return ans + cnt + 1
                visited[post] = 1
                q.append([post, cnt + 1])
    return 'use the stairs'

f, s, g, u, d = map(int, input().split())
print(sol())