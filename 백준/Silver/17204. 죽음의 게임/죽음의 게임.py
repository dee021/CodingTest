import sys
input = sys.stdin.readline

n, k = map(int, input().split())
target = [int(input()) for _ in range(n)]
visited = [-1 for _ in range(n)]
visited[0] = 0
idx = 0

while visited[target[idx]] == -1:
    visited[target[idx]] = visited[idx] +1
    idx = target[idx]

print(visited[k])