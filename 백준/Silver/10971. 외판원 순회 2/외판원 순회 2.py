from itertools import permutations

n = int(input())
w = [list(map(int, input().split())) for _ in range(n)]
t = list(map(list, permutations(range(n-1), n-1)))
ans = 1000000*10
for lst in t:
    lst.append(n-1)
    s = n-1; res = 0
    for v in lst:
        if not w[s][v]:
            break
        res += w[s][v]
        s = v
    else:
        if ans > res:
            ans = res
print(ans)    