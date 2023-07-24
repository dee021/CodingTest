import sys
input = sys.stdin.readline

def sol(k):
    f = set([k])
    t = [set([k])]
    while len(f) < n:
        tmp = set()
        for vs in t[-1]:
            for v in arr[vs]:
                if v in f:
                    continue
                tmp.add(v)
        f = f.union(set(tmp))
        t.append(tmp)
    return sum([i*len(t[i]) for i in range(len(t))])

n, m = map(int, input().split())
arr = [[] for _ in range(n)]

for _ in range(m):
    a, b = map(int, input().split())
    arr[a-1].append(b-1)
    arr[b-1].append(a-1)
ans = [sol(i) for i in range(n)]
print(ans.index(min(ans))+1)