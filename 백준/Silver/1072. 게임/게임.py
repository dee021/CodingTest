sol = lambda x, y: ((z+1)*x-100*y)/(100-z-1)

while True:
    try:        
        x, y = map(int, input().split())
    except:
        break
    z = y*100//x
    if z >= 99:
        print(-1)
    else:
        ans = sol(x, y)
        ans = int(ans + (1 if round(ans%1,10) else 0))
        print(ans)