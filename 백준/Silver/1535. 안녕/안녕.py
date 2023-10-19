def sol(b):
    res = []
    if len(b) < n:
        b = '0'*(n-len(b)) + b
    for i in range(n):
        if b[i] == '1':
            res.append([p[i], j[i]])
    if not res:
        res = [[0,0]]
    res = [sum(x) for x in zip(*res)]
    return res[1] if res[0] < 100 else 0

n = int(input())
p = list(map(int, input().split()))
j = list(map(int, input().split()))
ans = set(map(sol, [bin(x)[2:] for x in range(2**n)]))
print(max(ans))