from itertools import combinations as cb

for _ in range(int(input())):
    n, m = map(int, input().split())
    ans = 0
    for a, b in list(cb([x for x in range(1, n)], 2)):
        if (a**2+b**2+m) % (a*b) == 0:
            ans += 1
    print(ans)