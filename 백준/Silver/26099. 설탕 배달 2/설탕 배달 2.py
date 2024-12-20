n = int(input())
k = n//5
while k >= 0:
    if (n - 5*k)%3 == 0:
        print(k + (n - 5*k)//3)
        break
    k -= 1
else:
    print(-1)