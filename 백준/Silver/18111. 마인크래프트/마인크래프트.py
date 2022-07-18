import sys
from collections import Counter

x, y, b = map(int, sys.stdin.readline().split())
block = b
minsec = 500*500*256*2;h = 0
ground = [] 

def time(num):
    global block, sec
    if num > block: # 1번 작업
        sec += (num-block) * 2 * ground[num]
    else: # 2번 작업
        sec += (block - num) * ground[num]

for i in range(x):
    ground.extend(list(map(int, sys.stdin.readline().split())))
    block += sum(ground[y*i:y*i+y])
maxb = block//(x*y) if block//(x*y) <= 256 else 256

ground = Counter(ground)
key = set(ground.keys())

for i in range(min(ground), maxb+1):
    block = i
    sec = 0
    list(map(time, key))
    if minsec >= sec:
        minsec, h = sec, i

print(minsec, h)