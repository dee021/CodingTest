L = 1299709
r = L//3+1
prime = [True if x%2 or x==2 else False for x in range(L+1)]
prime[0] = prime[1] = False
for p in range(3, L+1, 2):
    if p**2 > L:
        break
    if not prime[p]:
        continue
    for k in range(3, r, 2):
        if p*k > L:
            break
        prime[p*k] = False

for _ in range(int(input())):
    k = int(input())
    if prime[k]:
        print(0)
    else:
        l, r = (k-2, k+2) if k%2 else (k-1, k+1)
        f = [not prime[l], not prime[r]]
        while any(f):
            if f[0]:
                l -= 2
                if prime[l]:f[0] = False
            if f[1]:
                r += 2
                if prime[r]:f[1] = False
        print(r-l)