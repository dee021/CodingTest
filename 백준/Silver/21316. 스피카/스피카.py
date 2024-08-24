import sys
input = sys.stdin.readline

def check(node):
    cnt = set()
    for adj in edges[node]:
        cnt.add(count[adj])
    if cnt == set([1,2,3]):
        return True
    return False

edges = [[] for _ in range(13)]
count = [0 for _ in range(13)]

for _ in range(12):
    a, b = map(int, input().split())
    edges[a].append(b)
    edges[b].append(a)
    count[a] += 1
    count[b] += 1

for star in range(1, 13):
    res = check(star)
    if res:
        print(star)
        break