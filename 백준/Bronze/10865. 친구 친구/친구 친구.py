import sys
input = sys.stdin.readline

n, m = map(int, input().split())
st = [0 for _ in range(n+1)]
for _ in range(m):
    a, b = map(int, input().split())
    st[a] += 1
    st[b] += 1
del st[0]
print(*st, sep='\n')