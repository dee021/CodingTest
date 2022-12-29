ans = 1
n, a, b = map(int, input().split())
a, b = min(a, b)-1, max(a, b)-1

while True:
    if a+1==b and a%2==0:
        break
    a //= 2
    b //= 2
    ans += 1
print(ans)