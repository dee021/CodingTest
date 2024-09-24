g = int(input())
flag, before, now = 0, 1, 2
while before < now:
    if now**2 - before**2 == g:
        flag = 1
        print(now)
        before += 1
        now += 1
    elif now**2 - before**2 > g:
        before += 1
    else:
        now += 1
if not flag:
    print(-1)