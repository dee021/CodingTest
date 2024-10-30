def psb(idx=0, cnt=0, res=0):
    if cnt == m:
        if prime[res]:
            ans.add(res)
        return
    
    if idx >= n:
        return
    
    psb(idx+1, cnt, res)
    psb(idx+1, cnt+1, res + arr[idx])

n, m = map(int, input().split())
arr = list(map(int, input().split()))

prime = [1 if x%2 or x == 2 else 0 for x in range(sum(arr)+1)]
prime[1] = 0

for p in range(3, len(prime), 2):
    if not prime[p]:
        continue
    if p*p > len(prime):
        break
    k = 3
    while k*p < len(prime):
        prime[k*p] = 0
        k += 2

ans = set()
psb()
if ans:
    print(*sorted(ans))
else:
    print(-1)