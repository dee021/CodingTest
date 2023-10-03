while True:
    try:
        n = input().strip()
    except:
        break
    ans, n = len(n), int(n)
    a = '1'*ans
    while True:
        if not int(a)%n:
            print(ans)
            break
        ans += 1
        a += '1'