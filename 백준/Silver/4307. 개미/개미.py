import sys
input = sys.stdin.readline

for _ in range(int(input())):
    l, n = map(int, input().split())
    minV, maxV = 0, 0
    ants = sorted([int(input()) for _ in range(n)])
    for i in range(n):
        minV = max(minV, min(ants[i], l-ants[i]))
        maxV = max(maxV, ants[i], l-ants[i])
    print(minV, maxV)