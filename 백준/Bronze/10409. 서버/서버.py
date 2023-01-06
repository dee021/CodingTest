n, t = map(int, input().split())
j = list(map(int, input().split()))
ans = 0
for i in range(n):
    t -= j[i]
    if  t >= 0:
        ans += 1
    else:
        break
print(ans)