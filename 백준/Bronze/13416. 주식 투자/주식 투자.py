import sys
input = sys.stdin.readline

for _ in range(int(input())):
    ans = 0
    for b in [list(map(int, input().split())) for _ in range(int(input()))]:
        m = max(b)
        if m > 0:
            ans += m
    print(ans)