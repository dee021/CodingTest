import sys
input = sys.stdin.readline
from collections import Counter

n, m = map(int, input().split())
s = [input().strip() for _ in range(n)]
cnt = [Counter(x) for x in zip(*s)]
ans, hd = '', 0

for c in cnt:
    k = sorted([k for k in c.keys() if c[k] == max(c.values())])[0]
    ans += k
    hd += sum(c.values()) - c[k]
print(ans, hd, sep='\n')