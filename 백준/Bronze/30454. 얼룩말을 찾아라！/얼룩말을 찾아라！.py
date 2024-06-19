import sys
input = sys.stdin.readline

n, l = map(int, input().split())
b, h = 0,0
for _ in range(n):
    cnt = len(list(filter(lambda x:x, input().strip().split('0'))))
    if b < cnt:
        b, h = cnt, 1
    elif b == cnt:
        h += 1
print(b, h)