import sys
input = sys.stdin.readline

n = int(input())
d = {}
for _ in range(n):
    s = input().strip().split('.')[1]
    d[s] = d.setdefault(s, 0) + 1

for k in sorted(d.keys()):
    print(k, d[k])