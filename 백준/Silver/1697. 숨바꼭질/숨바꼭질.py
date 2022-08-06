import sys
from collections import deque

load = [0 for _ in range(100001)]
queue = deque()

def dis():
    global load, k, queue
    a, dep = queue.popleft()
    if a < 0 or a > 100000: # 범위 이탈
        return
    if a == k: # 종료 조건
        load[a] = dep
        return
    elif a > k:
        if load[k] and load[k] <= dep + a - k:
            return
        else:
            load[k] = dep + a - k
            return
    if load[a] and load[a] <= dep:
        return
    else: # load[a] > dep
        load[a] = dep
    queue.extend([[a-1, dep+1], [a+1, dep+1], [a*2, dep+1]])

n, k = map(int, sys.stdin.readline().split())

queue.extend([[n, 0]])
while not(load[k]) or load[k] > queue[0][1]:
    dis()
    if not(queue):
        break

print(load[k])