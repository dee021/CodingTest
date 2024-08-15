import sys
input = sys.stdin.readline

n = int(input())
dis = list(map(int, input().split()))
ans = 0
for i, time, in enumerate(map(int, input().split())):
    tmp = max(dis[i], time) + dis[i]
    ans = max(ans, tmp)
print(ans)