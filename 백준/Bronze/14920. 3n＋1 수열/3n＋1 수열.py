n = int(input())
ans = 1

while n != 1:
    ans += 1
    if n%2:
        n = 3*n+1
    else:
        n //= 2

print(ans)