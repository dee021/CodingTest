import sys
input = sys.stdin.readline

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
arr.sort(key = lambda x:-x[1])

start = float('inf')
for i in range(n):
    t, s = arr[i]
    start = min(start, s) - t
    if start < 0:
        start = -1
        break
print(start)