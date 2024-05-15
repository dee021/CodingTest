def sol(res):
    for i in range(10):
        t = res*10 + i
        flag = 1
        if (t != 2 and t % 2 == 0) or t == 1:
            continue
        
        for f in range(3, t, 2):
            if f * f > t:
                break
            if t % f == 0:
                flag = 0
                break
        if not flag:
            continue
        elif small <= t < big:
            ans.append(t)
        else:
            sol(t)
            
n = int(input())
small, big = 10**(n-1), 10**n
ans = []
sol(0)
print(*sorted(ans), sep = '\n')