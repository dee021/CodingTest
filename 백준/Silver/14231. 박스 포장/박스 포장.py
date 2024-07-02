n = int(input())
ans, level = 0, {0:[-1]}
for x in list(map(int, input().split())):
    for k in range(ans, -1, -1):
        if any([y for y in level[k] if y <x]):
            level.setdefault(k+1, []).append(x)
            ans = max(ans, k+1)
            break
print(ans)