import sys
input = sys.stdin.readline

c = []
n, m = map(int, input().split())
for _ in range(n):
    t = input().split()
    t[1] = int(t[1])
    c.append(t)

for _ in range(m):
    u = int(input())
    l, r, p = 0, n-1, (n-1)//2
    while l <= r:
        if u > c[p][1]:
            l = p + 1
        else:
            r = p - 1 
        p = (l+r)//2
    print(c[l][0])