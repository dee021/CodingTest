n, s, r = map(int, input().split())
t1 = set(map(int, input().split()))
t2 = set(map(int, input().split()))
t1, t2 = t1 - t2, t2 - t1
for t in sorted(t1):
    if t-1 in t2:
        t2.discard(t-1)
        t1.discard(t)
    elif t+1 in t2:
        t2.discard(t+1)
        t1.discard(t)
print(len(t1))