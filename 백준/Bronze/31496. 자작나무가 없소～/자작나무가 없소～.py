import sys
input = sys.stdin.readline

conv = lambda x: int(x) if x.isnumeric() else x.split('_')

ans = 0
n, s = input().strip().split()
for _ in range(int(n)):
    item, cnt = map(conv, input().strip().split())
    if s in set(item):
        ans += cnt
print(ans)