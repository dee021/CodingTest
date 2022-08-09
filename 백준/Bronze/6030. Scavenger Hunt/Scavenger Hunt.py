from itertools import product

n, m = map(int, input().split())
nfac = [x for x in range(1, n+1) if n%x == 0]
mfac = [x for x in range(1, m+1) if m%x == 0]
for i in list(product(nfac,mfac)):
    print(*i)