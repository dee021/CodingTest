import sys
input = sys.stdin.readline

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
d = {x:set() for x in range(n)}
for k in range(n):
    for o in range(k+1,n):
        for i in range(5):
            if arr[k][i] == arr[o][i]:
                d[k].add(o)
                d[o].add(k)
                break

cnt, ans = 0, 0
for k, v in d.items():
    if len(v) > cnt:
        cnt = len(v)
        ans = k
print(ans+1)