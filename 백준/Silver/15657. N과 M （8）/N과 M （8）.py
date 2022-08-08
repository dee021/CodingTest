import sys

nums = []

def arrPrint(dep, idx):
    global arr, n, m
    if dep == m:
        print(*nums)
        return
    for i in range(idx, n):
        if nums and nums[-1] > arr[i]:
            continue
        nums.append(arr[i])
        arrPrint(dep+1, i)
        nums.pop()    

n, m = map(int, sys.stdin.readline().split())
arr = sorted(list(map(int, sys.stdin.readline().split())))

for i in arr:
    nums.append(i)
    arrPrint(1, 0)
    nums.pop()