from collections import deque

for _ in range(int(input())):
    s = deque(input().split())
    s.rotate(-2)
    print(' '.join(s))