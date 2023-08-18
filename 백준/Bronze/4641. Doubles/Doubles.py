while True:
    s = set(map(int, input().split())) - {0}
    if s == {-1}:
        break
    ans = 0
    for k in [x*2 for x in s]:
        if k in s:
            ans += 1
    print(ans)