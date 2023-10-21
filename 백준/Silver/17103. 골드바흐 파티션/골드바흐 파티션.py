L = 1000000
p = [True if x%2 or x==2 else False for x in range(L+1)]
p[0] = p[1] = False
for i in range(3,len(p),2):
    if i**2 > L:
        break
    if not p[i]:
        continue
    k = 3
    while i*k <= L:
        p[i*k] = False
        k += 2

for _ in range(int(input())):
    n = int(input())
    ans = 0
    for x in range(2, n//2+1):
        if p[x] and p[n-x]:
            ans += 1
    print(ans)