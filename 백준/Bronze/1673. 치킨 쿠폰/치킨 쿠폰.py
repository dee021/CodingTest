while True:
    try:
        n, k = map(int, input().split())
    except:
        break
    ans = s = n
    while s >= k:
        ans += s//k
        s = s%k + s//k
    print(ans)