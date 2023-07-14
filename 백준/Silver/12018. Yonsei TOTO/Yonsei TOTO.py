n, m = map(int, input().split())
arr = []; ans = 0
for _ in range(n):
    p, l = map(int, input().split())
    t = sorted(map(int, input().split()), reverse=True)
    t = t[l-1] if p >= l else 1
    arr.append(t)

for t in sorted(arr):
    if m >= t:
        m -= t
        ans += 1
print(ans)