from collections import Counter

n, c = map(int, input().split())
arr = list(map(int, input().split()))
idx = arr.index
cnt = Counter(arr)
rcnt = {}
for k, v in cnt.items():
    if v in rcnt:
        rcnt[v].append(k)
    else:
        rcnt[v] = [k]
ans = []
for k in sorted(rcnt.keys(), reverse=True):
    tmp = sorted(rcnt[k], key = lambda x:idx(x))
    for m in tmp:
        ans.extend([m]*k)
print(*ans)