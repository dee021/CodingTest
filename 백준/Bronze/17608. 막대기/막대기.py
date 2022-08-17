import sys
from collections import deque
stick = deque(); maxV = 0
for i in range(int(sys.stdin.readline())):
    num = int(sys.stdin.readline())
    maxV = max(maxV, num)
    if num == maxV:
        stick = deque([num])
    else:
        stick.appendleft(num)

maxV = stick[0];cnt = 1
for i in range(1, len(stick), 1):
    if stick[i] > maxV:
        cnt += 1
        maxV = stick[i]

print(cnt)