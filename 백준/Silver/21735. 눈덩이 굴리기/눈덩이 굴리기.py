from collections import deque
import sys
input = sys.stdin.readline

def dfs():
    ans = 1
    q = deque([[0, 1, m]])
    while q:
        x, size, time = q.popleft()
        if x < n and time > 0:
            q.append([x+1, size + height[x+1], time - 1])
            ans = max(ans, size + height[x+1])
        if x + 1 < n and time > 0:
            q.append([x+2, size//2 + height[x+2], time - 1])
            ans = max(ans, size//2 + height[x+2])
    return ans

n, m = map(int, input().split())
height = [0] + list(map(int, input().split()))
print(dfs())