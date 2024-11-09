import sys
input = sys.stdin.readline

def distance(key):
    color[key].sort()
    if len(color[key]) == 1:
        return 0
    dis = color[key][1] - color[key][0] + color[key][-1] - color[key][-2]
    for i in range(1, len(color[key])-1):
        dis += min(color[key][i] - color[key][i-1], color[key][i+1] - color[key][i])
    return dis

color = {}
n = int(input())
for _ in range(n):
    s, c = map(int, input().split())
    color.setdefault(c, []).append(s)

print(sum(map(distance, color.keys())))