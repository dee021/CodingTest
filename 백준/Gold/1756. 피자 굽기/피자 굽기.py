import sys
input = sys.stdin.readline

ans = 0
d, n = map(int, input().split())
depth = []
value = float('inf')
for v in list(map(int, input().split())):
    value = min(value, v)
    depth.append(value)

pizza = list(map(int, input().split()))
p = 0
for idx in range(d-1, -1, -1):
    if depth[idx] >= pizza[p]:
        p += 1
        if p == n:
            ans = idx +1
            break
print(ans)