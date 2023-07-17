for _ in range(3):
    ans, cnt = 1, 1
    num = list(map(int, input()))
    for i in range(1,8):
        if num[i-1] == num[i]:
            cnt += 1
            ans = max(ans, cnt)
        else:
            cnt = 1
    print(ans)