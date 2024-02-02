import sys
input = sys.stdin.readline

for _ in range(int(input())):
    l, n = map(int, input().split())
    minV, maxV = 0, 0
    ants = sorted([int(input()) for _ in range(n)])
    for i in range(n):
        minV = max(minV, min(ants[i], l-ants[i]))
        maxV = max(maxV, ants[i], l-ants[i])
        if i:
            m = (ants[i]-ants[i-1])/2
            maxV = max(maxV, ants[i-1] + m, l - ants[i] + m)
        if i != n - 1:
            m = (ants[i+1]-ants[i])/2
            maxV = max(maxV, ants[i] + m, l - ants[i+1] + m)
    print(minV, maxV)