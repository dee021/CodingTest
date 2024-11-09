import sys
input = sys.stdin.readline

n = int(input())
cnt = list(map(int, input().split()))
level = [[] for _ in range(5)]
for _ in range(n):
    l, t = map(int, input().split())
    level[l-1].append(t)
time = 60*4
for l in range(5):
    level[l].sort()
    time += level[l][0]
    for t in range(1, cnt[l]):
        time += level[l][t]*2 - level[l][t-1]
print(time)