import math

for _ in range(int(input())):
    d = int(input())
    ans = 0
    for n in range(math.floor(d**(1/3)), math.ceil(d**(1/2))+1):
        if n**2 + n > d:
            break
        ans = n
    print(ans)