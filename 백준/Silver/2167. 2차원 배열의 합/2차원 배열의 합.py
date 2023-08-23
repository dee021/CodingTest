import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
for _ in range(int(input())):
    i, j, x, y = map(int, input().split())
    ans = 0
    for r in range(i-1, x):
        for c in range(j-1, y):
            ans += arr[r][c]
    print(ans)