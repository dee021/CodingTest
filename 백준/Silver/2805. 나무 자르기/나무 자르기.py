import sys

def findM(k, lst):
    maxval = 0
    start = 0
    end = max(lst)
    pivot = end//2
    while pivot >= start and pivot <= end:
        def findNum(num):
            return num-pivot if num-pivot >= 0 else 0
        t = sum(list(map(findNum, lst))) # 가져갈 나무 
        if t >= k:
            maxval = max(maxval, pivot)
            start = pivot + 1
        else: # t < k
            end = pivot -1
        pivot = (start+end)//2
    return maxval

n, m = map(int, sys.stdin.readline().split())
tree = list(map(int, sys.stdin.readline().split()))

print(findM(m, tree))