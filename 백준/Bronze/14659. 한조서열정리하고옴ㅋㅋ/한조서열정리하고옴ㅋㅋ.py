import sys

maxv = temp = h = 0
n = int(input())
arr = list(map(int, sys.stdin.readline().split()))
for i in range(n-1):
    if arr[h] > arr[i+1]:
        temp += 1
    else:
        maxv = max(maxv, temp)
        h = i+1
        temp = 0
maxv = max(maxv, temp)
print(maxv)
