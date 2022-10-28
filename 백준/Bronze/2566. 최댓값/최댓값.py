import sys
input = sys.stdin.readline

maxValue = row = col = 0

for r in range(1,10):
    for c, val in enumerate(list(map(int, input().split()))):
        if val > maxValue:
            maxValue = val
            row, col = r, c+1
if maxValue == 0:
    row = col = 1
print(maxValue)
print(row, col)