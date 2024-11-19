from collections import deque
import sys
input = sys.stdin.readline
conv = lambda x: int(x) if x.isnumeric() else x

def sol():
    while len(line) > 1:
        stu = line.popleft()
        line.rotate(-stu[1] +1)
        line.popleft()
    return line[0][0]

n = int(input())
line = deque([list(map(conv, input().split())) for _ in range(n)])
print(sol())