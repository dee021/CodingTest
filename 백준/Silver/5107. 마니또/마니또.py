import sys
input = sys.stdin.readline

tc = 1
while True:
    n = int(input())
    if not n:
        break
    d = {}
    for _ in range(n):
        a, b = input().strip().split()
        d[a] = b
    keys = list(d.keys())
    cnt = 0
    while keys:
        cnt += 1
        name = keys.pop()
        cur = name
        while d[cur] != name:
            cur = d.pop(cur)
        d.pop(cur)
        keys = list(d.keys())
    print(tc, cnt)
    tc += 1