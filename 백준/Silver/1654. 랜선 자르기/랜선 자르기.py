import sys

def findCm(m, lst):
    maxval = 1
    start = 1
    end = max(lst)
    pivot = end//2
    while pivot >= start and pivot <= end:
        def findNum(num):
            return num//pivot
        temp = sum(list(map(findNum, lst))) # (pivot)cm 단위로 자른 경우 만들 수 있는 랜선의 수
        if temp == m:
            maxval = max(maxval, pivot)
            start = pivot +1
        elif temp > m:
            maxval = max(maxval, pivot) # n개보다 많이 만드는 것도 포함이므로
            start = pivot +1
        else: # temp < m:
            end = pivot -1
        pivot = (start+end)//2
    return maxval

k, n = map(int, sys.stdin.readline().split())
lan = []

for i in range(k):
    lan.append(int(sys.stdin.readline()))

print(findCm(n, lan))
