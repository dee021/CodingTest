import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = []
for i in range(1, m+1):
    l, r = map(int, input().split())
    arr.append([l, i])
    arr.append([r, i])
arr = [list(x) for x in zip(*sorted(arr))]
print(arr[1][n%(m*2)-1])