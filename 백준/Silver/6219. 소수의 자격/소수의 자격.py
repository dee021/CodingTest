a, b, d = input().split()
a, b = map(int, [a,b])
prime = [1 if x%2 else 0 for x in range(b+1)]
prime[1], prime[2] = 0,1
ans = int(a <= 2 and d == '2')

for p in range(3, b+1, 2):
    if not prime[p]:
        continue
    if a <= p and d in str(p):
        ans += 1
    if p**2 > b+1:
        continue
    k = 3
    while p*k <= b:
        prime[p*k] = 0
        k += 2
print(ans)