for _ in range(int(input())):
    n, k = map(int, input().split())
    ans = 0
    for c in list(map(int, input().split())):
        ans += c//k
    print(ans)