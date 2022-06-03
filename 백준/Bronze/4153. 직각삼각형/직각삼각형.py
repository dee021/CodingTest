while True:
    leng=list(map(int,input().split()))
    cond1 = sum(leng)
    if not cond1:
        break
    a = max(leng)
    leng.remove(max(leng))

    res = a**2 == leng[0]**2 + leng[1]**2
    print('right') if res else print('wrong')