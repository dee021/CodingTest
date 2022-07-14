import sys

def findNum(k, lst):
    start = 0
    end = len(lst) - 1
    pivot = end//2
    while pivot >= start and pivot <= end:
        if lst[pivot] == k:
            return '1'
        elif lst[pivot] > k:
            end = pivot -1
        else: # lst[pivot] < k:
            start = pivot + 1
        pivot = (start+end)//2
    return '0'

n = int(input())
numlist = list(map(int, sys.stdin.readline().split()))
numlist.sort()

m = int(input())
num = list(map(int, sys.stdin.readline().split()))

for i in num:
    print(findNum(i, numlist))
