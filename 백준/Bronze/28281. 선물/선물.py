n, x = map(int, input().split())
c = list(map(int, input().split()))
ans = 2000
for i in range(n-1):
    if ans > c[i]+c[i+1]:
        ans = c[i]+c[i+1]
print(ans*x)