import sys
input = sys.stdin.readline

ans = 0
n = int(input())
logs = {}

for _ in range(n):
    p, io = map(int, input().split())
    if p in logs:
        if io == logs.get(p):
            ans += 1
        else:
            logs.pop(p)
    elif io:
        logs[p] = io
    else:
        ans += 1
print(ans + len(logs))