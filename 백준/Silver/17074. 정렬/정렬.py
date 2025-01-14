import sys
input = sys.stdin.readline

def sol():
    if n == 2:
        return 2
    desc, idx = 0, -1
    for i in range(1, n):
        if arr[i-1] > arr[i]:
            desc += 1
            if desc >= 2:
                return 0
            idx = i

    if desc == 0:
        return n

    if idx == 1:
        if arr[idx-1] > arr[idx+1]:
            return 1
        return 2
    if idx == n-1:
        if arr[idx-2] > arr[idx]:
            return 1
        return 2
    return (arr[idx-2] <= arr[idx]) + (arr[idx-1] <= arr[idx+1])

n = int(input())
arr = list(map(int, input().split()))

print(sol())