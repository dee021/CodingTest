import sys
input = sys.stdin.readline

n = int(input())
d = {0:0}
l, r, total = 0,0,0
for _ in range(n):
    for f in list(map(int, input().split())):
        if not f:
            continue
        d[f] = d.setdefault(f, 0) + 1
        total += f
        r = max(r, f)
half = total/2
while l <= r:
    mid = (l+r)//2
    cnt = 0
    for k in d.keys():
        cnt += min(k, mid) * d[k]
    
    if cnt >= half:
        r = mid - 1
    else:
        l = mid + 1
print(l)