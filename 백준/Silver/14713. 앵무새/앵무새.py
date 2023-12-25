from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
words = [deque(input().strip().split()) for _ in range(n)]
done = [1 for _ in range(n)]
ans = 'Possible'
for word in input().strip().split():
    f = 0
    for b in range(n):
        if done[b] and words[b][0] == word:
            f = 1
            words[b].popleft()
            if not words[b]:
                done[b] = 0
            break
    if not f:
        ans = 'Impossible'
        break
if any(done):
    ans = 'Impossible'
print(ans)