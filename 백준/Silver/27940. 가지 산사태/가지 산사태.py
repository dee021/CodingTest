import sys
input = sys.stdin.readline

n, m, k = map(int, input().split())
for i in range(m):
    t, r = map(int, input().split())
    k -= r
    if k < 0:
        print(i+1, 1)
        break
if k >= 0:
    print(-1)