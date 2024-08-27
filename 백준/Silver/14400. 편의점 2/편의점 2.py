import sys
input = sys.stdin.readline

n = int(input())
arr = sorted([list(map(int, input().split())) for _ in range(n)])
psb = [sorted(x)[n//2:n//2+(1 if n%2 else 2)] for x in zip(*arr)]

ans = float('inf')
for i in range(len(psb[0])):
    x, y = psb[0][i], psb[1][i]
    tmp = 0
    for j in range(n):
        tmp += abs(x - arr[j][0]) + abs(y - arr[j][1])
    ans = min(ans, tmp)
print(ans)