import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
queue = deque()
temp = list(map(int, input().split()))


for i, num in enumerate(list(map(int, input().split()))):
    if not temp[i]:
        queue.appendleft(num)
m = int(input())
queue.extend(list(map(int, input().split())))
print(*list(queue)[:m])