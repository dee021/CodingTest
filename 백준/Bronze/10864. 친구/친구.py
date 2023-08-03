import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [[0 for _ in range(n)] for _ in range(n)]

for _ in range(m):
    a, b = map(int, input().split())
    arr[a-1][b-1] = 1
    arr[b-1][a-1] = 1

print(*[sum(arr[i]) for i in range(n)], sep='\n')