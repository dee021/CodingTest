import sys
n = int(input())

per = []

for i in range(n):
    w, h = map(int, sys.stdin.readline().split())
    per.append([w, h, 0])

for i in range(n): # rank
    rank = 1
    w, h = per[i][0], per[i][1]
    for j in range(n):
        if i == j:
            continue
        if w < per[j][0] and h < per[j][1]:
            rank = rank + 1
    per[i][2] = rank
        
print(' '.join([str(x[2]) for x in per]))