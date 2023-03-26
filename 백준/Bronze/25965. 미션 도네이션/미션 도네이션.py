import sys
input = sys.stdin.readline

for _ in range(int(input())):
    ans = 0
    done = [list(map(int, input().split())) for _ in range(int(input()))]
    k, d, a = map(int, input().split())
    for do in done:
        t = k*do[0] - d*do[1] + a*do[2]
        if t > 0:
            ans += t
    print(ans)