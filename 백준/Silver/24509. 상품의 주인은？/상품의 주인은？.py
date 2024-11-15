import sys
input = sys.stdin.readline

def noStd(lst):
    for s in range(100, -1, -1):
        for n in sorted(lst[s]):
            if n not in ans:
                ans.append(n)
                return

a = [[] for _ in range(101)]
b = [[] for _ in range(101)]
c = [[] for _ in range(101)]
d = [[] for _ in range(101)]
ans = []

for _ in range(int(input())):
    n, k, e, m, s = map(int, input().split())
    a[k].append(n)
    b[e].append(n)
    c[m].append(n)
    d[s].append(n)
    
noStd(a)
noStd(b)
noStd(c)
noStd(d)

print(*ans)