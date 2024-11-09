def sol(time):
    btn = [600, 60, 30, 10]
    cur = 0
    flag = 1
    for t in btn:
        if t == 30 and time//t:
            flag = 0
        cur += time//t
        time %= t
        if not time:
            break
    return cur + flag

conv = lambda x: int(x[:2])*60 + int(x[3:])
time = conv(input().strip())
print(sol(time))