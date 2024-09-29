n = int(input())
pay = list(map(int, input().split()))
pay = {'BSGP'[x]:pay[x]-1 for x in range(4)}
pay['D'] = pay['P']+1
ans = 0
a, b = 0, 0

for g in input().strip():
    if g == 'D':
        b = pay[g]
    else:
        b = pay[g] - a
    ans += b
    a = b
print(ans)