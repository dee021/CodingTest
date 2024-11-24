import sys
input = sys.stdin.readline

h, w = map(int, input().split())
n = int(input())
dolls = sorted(list(map(int, input().split())))
front = [0 for _ in range(w)]
cnt, c = 0, 0

for d in dolls:
    if front[c] < d:
        front[c] = d
        cnt += 1
        c = (c+1)%w
print(min(cnt, w*h))