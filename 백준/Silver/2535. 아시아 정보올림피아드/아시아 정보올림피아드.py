import sys
input = sys.stdin.readline

n = int(input())
arr = sorted([list(map(int, input().split())) for _ in range(n)], key = lambda x:(-x[2]))
ctr = {}
cnt = 0
for c, k, s in arr:
    if cnt >= 3:
        break
    if c in ctr and ctr[c] >= 2:
        continue
    ctr[c] = ctr.setdefault(c, 0) +1
    cnt += 1
    print(c, k)