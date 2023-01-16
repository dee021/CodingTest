ans = 10**20
n, q = map(int, input().split())
for i in range(n):
    p, k, c = map(int, input().split())
    t = q//k if q%k else q//k - 1
    if ans > t*(t+1)//2*c + p:
        ans = t*(t+1)//2*c + p
        num = i+1
print(num, ans)