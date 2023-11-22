ex = open(0)
input = ex.readline

n, m = map(int, input().split())
memo = {k:0 for k in [input().strip() for _ in range(n)]}
ans = []
for _ in range(m):
    for k in input().strip().split(','):
        if k in memo:
            memo.pop(k)
    print(len(memo.keys()))