from collections import Counter
ans = 0
a = Counter(input())
b = Counter(input())
ak = set(a.keys())
bk = set(b.keys())
for c in ak | bk:
    ans += max(a[c], b[c]) - min(a[c], b[c])
print(ans)