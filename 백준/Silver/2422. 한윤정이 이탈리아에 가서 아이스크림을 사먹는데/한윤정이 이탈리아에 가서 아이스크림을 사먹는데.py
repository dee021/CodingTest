import sys
input = sys.stdin.readline

n, m = map(int, input().split())
d, ans = {x:set() for x in range(1, n+1)}, 0
for _ in range(m):
    a, b = map(int, input().split())
    d[a].add(b)
    d[b].add(a)

for a in range(1, n-1):
    for b in range(a+1, n):
        if b not in d[a]:
            for c in range(b+1, n+1):
                if c not in (d[a] | d[b]):
                    ans += 1
print(ans)         