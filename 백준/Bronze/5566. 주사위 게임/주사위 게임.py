import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [int(input()) for _ in range(n)]
p = 0
for ans in range(m):
    p += int(input())
    if p < 0:
        p = 0
    elif p >= n:
        print(ans+1)
        break
    p += arr[p]
    if p < 0:
        p = 0
    elif p >= n-1:
        print(ans+1)
        break