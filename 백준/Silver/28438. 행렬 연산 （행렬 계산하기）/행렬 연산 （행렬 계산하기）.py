import sys
input = sys.stdin.readline

n, m, q = map(int, input().split())
row = [0 for _ in range(n+1)]
col = [0 for _ in range(m+1)]

for _ in range(q):
    o, line, v = map(int, input().split())
    if o == 1:
        row[line] += v
    else:
        col[line] += v

line = [0 for _ in range(m)]
for r in range(1, n+1):
    for c in range(1, m+1):
        line[c-1] = row[r] + col[c]
    print(*line)