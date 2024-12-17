import sys
input = sys.stdin.readline

n = int(input())
start, end = 0, 100000
for _ in range(n):
    s, e = map(int, input().split())
    start = max(start, s)
    end = min(end, e)

print(start > end and start - end or 0)