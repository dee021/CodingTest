import sys
input = sys.stdin.readline

n, m = map(int, input().split())
status = list(map(int, input().split()))

for _ in range(m):
    o, a, b = map(int, input().split())
    if o == 1:
        status[a-1] = b
    elif o >= 3:
        status[a-1:b] = [int(o == 4)] * (b-a+1)
    else:
        for i in range(a-1, b):
            status[i] ^= 1
print(*status)