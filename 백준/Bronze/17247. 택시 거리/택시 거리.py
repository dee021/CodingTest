import sys
input = sys.stdin.readline

n, m = map(int, input().split())
spot = []
for r in range(n):
    for c, p in enumerate(map(int, input().strip().split())):
        if p:
            spot.append([r, c])
print(abs(spot[0][0] - spot[1][0]) + abs(spot[0][1] - spot[1][1]))