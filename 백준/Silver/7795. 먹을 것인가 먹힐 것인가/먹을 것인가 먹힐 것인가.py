import sys
input = sys.stdin.readline

for _ in range(int(input())):
    ans = 0
    n, m = map(int, input().split())
    a = sorted(map(int, input().split()))
    b = sorted(map(int, input().split()))
    while n and m:
        while m:
            if a[n-1] > b[m-1]:
                ans += m
                n -= 1
                break
            else:
                m -= 1
    print(ans)