import sys
input = sys.stdin.readline

n, k = map(int, input().split())
m = [[] for _ in range(n)]
for _ in range(n):
    c, *t = map(int, input().split())
    m[c-1] = t
print(sorted(m, reverse=True).index(m[k-1])+1)