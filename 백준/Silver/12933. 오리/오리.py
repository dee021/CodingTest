def sol(string):
    order = 'quack'.index
    for c in string:
        k = order(c)
        if k and d[k-1]:
            d[k-1] -= 1
            d[k] += 1
        elif not k:
            if d[4]:
                d[4] -= 1
            d[k] += 1
        elif k and not d[k-1]:
            return -1
    for k in range(4):
        if d[k]:
            return -1
    return d[4]

d = {x:0 for x in range(5)}
ans = sol(input().strip())
print(ans)