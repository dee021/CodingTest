psb = [0,0]
n, l, k = map(int, input().split())
for _ in range(n):
    e, h = map(int, input().split())
    if h <= l:
        psb[0] += 1
    elif e <= l:
        psb[1] += 1
print(min(psb[0], k)*140 + min(max(0, k-psb[0]), psb[1])*100)
