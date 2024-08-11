import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(input().strip()) for _ in range(n)]

for r in range(n):
    tmp = -1
    for c in range(m):
        if arr[r][c] == 'c':
            tmp = 0
        elif tmp >= 0:
            tmp += 1
        arr[r][c] = tmp
    print(*arr[r])
