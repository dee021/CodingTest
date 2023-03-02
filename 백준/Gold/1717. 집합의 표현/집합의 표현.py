import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n, m = map(int, input().split())
prt = list(x for x in range(n+1))

def root(idx):
    if prt[idx] == idx:
        return idx
    r = root(prt[idx])
    prt[idx] = r
    return prt[idx]

for _ in range(m):
    o, a, b = map(int, input().split())
    if o: # 1
        print(root(a) == root(b) and 'YES' or 'NO')
    else: # 0
        prt[root(a)] = root(b)