import sys
input = sys.stdin.readline

p = int(input())
arr = list(map(int, input().split()))
k = int(input())
dis = p//k
for f in range(0, len(arr), dis):
    arr[f:f+dis] = sorted(arr[f:f+dis])
print(*arr)