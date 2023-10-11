def sol(num, d, idxs = []):
    s = set()
    for idx, n in enumerate(arr):
        if idx in idxs:
            continue
        res = num+n
        if d == 0:
            s.add(res)
        else:
            idxs.append(idx)
            s.update(sol(res, d-1, idxs))
            idxs.pop()
    return s

n = int(input())
k = int(input())
arr = [input() for _ in range(n)]
print(len(sol('', k-1,)))