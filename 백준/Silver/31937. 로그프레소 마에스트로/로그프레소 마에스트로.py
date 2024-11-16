import sys
input = sys.stdin.readline

def delete(a):
    for key in list(d.keys()):
        if a in d[key]:
            d.pop(key)
            
def add(a, b):
    for key in d.keys():
        if a in d[key]:
            d[key].add(b)

n, m, k = map(int, input().split())
virus = [0 for _ in range(n+1)]
d = dict()

for v in map(int, input().split()):
    virus[v] = 1
    d[v] = set([v])

logs = sorted([list(map(int, input().split())) for _ in range(m)])

for t, a, b in logs:
    if virus[a] and not virus[b]:
        delete(a)
    elif virus[a] and virus[b]:
        add(a, b)

for key in d.keys():
    if len(d[key]) == k:
        print(key)
        break