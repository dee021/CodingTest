import sys

# 행렬A
n, m = map(int, sys.stdin.readline().split())
mtA = []

for i in range(n):
    mtA.append(list(map(int, input().split())))

# 행렬B
m, k = map(int, sys.stdin.readline().split())
mtB = []

for i in range(m):
    mtB.append(list(map(int, input().split())))

# 행렬A*B
mtC = [[0 for _ in range(k)] for _ in range(n)]
for i in range(n):
    for j in range(k):
        res = 0
        for z in range(m):
            res += mtA[i][z] * mtB[z][j]
        mtC[i][j] = res

for i in mtC:
    print(' '.join([str(x) for x in i]))