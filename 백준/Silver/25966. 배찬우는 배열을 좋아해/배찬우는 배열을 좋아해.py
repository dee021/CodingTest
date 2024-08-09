import sys
input = sys.stdin.readline

def swap(i, j):
    tmp = arr[i]
    arr[i] = arr[j]
    arr[j] = tmp

n, m, q = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

for _ in range(q):
    o, i, j, *e = map(int, input().split())
    if o:
        swap(i, j)
    else:
        arr[i][j] = e[0]

for r in range(n):
    print(*arr[r])