def sigma(k):
    return k*(k+1)//2

n = int(input())
k = 1; ans = 0
while n:
    if sigma(k) > n:
        n -= sigma(k-1)
        ans += k-1
        k = 1
    else:
        k += 1
print(ans)