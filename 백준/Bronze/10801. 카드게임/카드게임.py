ans = [0,0]
for a, b in [list(x) for x in zip(*[list(map(int, input().split())) for _ in range(2)])]:
    if a != b:
        ans[a<b] += 1
print(ans[0] > ans[1] and 'A' or 'B' if ans[0] != ans[1] else 'D')