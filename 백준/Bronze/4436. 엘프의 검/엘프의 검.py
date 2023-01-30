while True:
    nums = set(map(str,range(10)))
    try:
        n = int(input())
    except:
        break
    k = 1
    while True:
        nums -= set(str(k*n))
        if not nums:
            print(k)
            break
        k += 1