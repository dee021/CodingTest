import sys
input = sys.stdin.readline

ans = []
n, m = map(int, input().split())
d = {x:0 for x in range(1, n+1)}
for _ in range(m):
    k, s, e = map(int, input().split())
    if d[k] <= s:
        ans.append('YES')
        d[k] = e
    else:
        ans.append('NO')
sys.stdout.write('\n'.join(ans))