for _ in range(int(input())):
    l = []
    while True:
        t = int(input())
        if not t:
            break
        l.append(t)
    l.sort(reverse=True)
    ans = 0
    for i in range(len(l)):
        if ans + 2*l[i]**(i+1) > 5*10**6:
            print('Too expensive')
            break
        ans += 2*l[i]**(i+1)
    else:
        print(ans)