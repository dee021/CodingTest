import sys
input = sys.stdin.readline

n = int(input())
chk = [list(map(int, input().split()))]
distance = []
dis = 0
gap = 0

for i in range(1, n):
    chk.append(list(map(int, input().split())))
    distance.append(abs(chk[i][0] - chk[i-1][0]) + abs(chk[i][1] - chk[i-1][1]))
    dis += distance[-1]
    if i >= 2:
        tmp = abs(chk[i][0] - chk[i-2][0]) + abs(chk[i][1] - chk[i-2][1])
        if gap < sum(distance[-2:]) - tmp:
            gap = sum(distance[-2:]) - tmp
print(dis - gap)