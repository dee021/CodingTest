import sys
input = sys.stdin.readline

t = 1
while True:
    n = int(input())
    if not n:
        break
    name = [input().strip() for _ in range(n)]
    s = set()
    for _ in range(2*n-1):
        k = input().split()[0]
        if k not in s:
            s.add(k)
        else:
            s.discard(k)
    print(t, name[int(*s)-1])
    t += 1