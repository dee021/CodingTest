import sys
input = sys.stdin.readline

n = int(input())
cur = 0
for i in range(n):
    a, b = map(int, input().split())
    cond = (cur)%(a+b)
    if cond <= b:
        cur += b - cond
    cur += 1
print(cur)