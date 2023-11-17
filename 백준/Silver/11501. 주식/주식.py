import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))
    ans, s = 0, arr[-1]
    for c in arr[:-1][::-1]:
        if c < s:
            ans += s - c
        elif c > s:
            s = c
    print(ans)