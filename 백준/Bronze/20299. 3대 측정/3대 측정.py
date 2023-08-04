import sys
input = sys.stdin.readline

t = 0
p = []
n, k, l = map(int, input().split())

for _ in range(n):
    r = list(map(int, input().split()))
    if all(l <= x for x in r) and sum(r) >= k:
        t += 1
        p.extend(r)
print(t)
sys.stdout.write(' '.join(map(str, p)))