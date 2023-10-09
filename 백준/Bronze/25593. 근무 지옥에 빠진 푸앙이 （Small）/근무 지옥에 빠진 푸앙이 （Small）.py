w = {}
n = int(input())
for _ in range(n):
    for t in range(4):
        for name in input().split():
            if name != '-':
                if name in w:
                    w[name] += [4,6,4,10][t]
                else:
                    w[name] = [4,6,4,10][t]
times = w.values()
print('Yes' if not times or max(times)-min(times) <= 12 else 'No')