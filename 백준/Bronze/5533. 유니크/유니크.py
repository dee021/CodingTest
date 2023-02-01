e = []
for _ in range(int(input())):
    e.append(list(map(int, input().split())))
g = [list(x) for x in zip(*e)]

for i in range(len(e)):
    print(sum([e[i][n] for n in range(3) if g[n].count(e[i][n])==1]))