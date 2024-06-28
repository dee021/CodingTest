import sys
input = sys.stdin.readline

n = int(input())
heights = [list(x) for x in zip(*[list(map(int, input().split())) for _ in range(2)])]
heights.sort(key = lambda x:x[1])
ans = 0
for i in range(n):
    ans += heights[i][0] + i * heights[i][1]
print(ans)