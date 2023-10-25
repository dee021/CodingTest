def sol(k):
    if prime[k]:
        return prime[k]
    
    for p in range(2, k):
        if k%p == 0:
            prime[k] = prime[p] + sol(k//p)
            break
    return prime[k]

L = 100000
prime = [True if x==2 or x%2 else False for x in range(L+1)]
prime[1] = False
for p in range(3, L+1, 2):
    if p**2 > L:
        break
    if not prime[p]:
        continue
    for k in range(3, L//3+1, 2):
        if p*k > L:
            continue
        prime[p*k] = False

a, b = map(int, input().split())
ans = 0
for k in range(a, b+1):
    res = sol(k)
    if prime[res] == True:
        ans += 1
print(ans)