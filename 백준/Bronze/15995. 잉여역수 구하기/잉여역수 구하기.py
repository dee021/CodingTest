a, m  = map(int, input().split())
ans  = 0;i=1
while not ans:
    if (a*i)%m == 1:
        ans = i
    i += 1
print(ans)