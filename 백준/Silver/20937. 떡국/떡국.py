import sys
input = sys.stdin.readline

size = [0] * 50001
input()
ans = 0
for s in map(int, input().split()):
    size[s] += 1
    ans = max(ans, size[s])
print(ans)