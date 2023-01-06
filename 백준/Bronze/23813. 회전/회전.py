from collections import deque

ans = 0
n = deque(input())
for _ in range(len(n)):
    n.appendleft(n.pop())
    ans += int(''.join(n))
print(ans)