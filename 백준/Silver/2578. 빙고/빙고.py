cs = [list(map(int, input().split())) for _ in range(5)]
bingo = []
for _ in range(5):
    bingo.extend(list(map(int, input().split())))
order = [[bingo.index(cs[r][c]) +1 for c in range(5)] for r in range(5)]
ans = [max(order[r]) for r in range(5)] + [max(list(x)) for x in zip(*order)]
c1, c2 = 0,0
for i in range(5):
    c1 = max(c1, order[i][i])
    c2 = max(c2, order[i][4-i])
ans.extend([c1, c2])
print(sorted(ans)[2])