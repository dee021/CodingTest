import sys
input = sys.stdin.readline

n = int(input())
arr = [] # [fruit, cnt]
idx = -1
for f in map(int, input().split()):
    if not arr or arr[idx][0] != f:
        arr.append([f, 1])
        idx += 1
    else: arr[idx][1] +=1

s, e, ans = 0, 0, 0
while s < len(arr):
    f1 = arr[s][0]
    cnt = arr[s][1]
    m, f2 = -1, -1
    for e in range(s+1, len(arr)):
        if arr[e][0] != f1 and m == -1:
            m = e
            f2 = arr[e][0]
        if arr[e][0] == f1 or arr[e][0] == f2:
            cnt += arr[e][1]
            if e-m > 0:m+=1
        else:break
    ans = max(ans, cnt)
    if s != m and m != -1:s = m
    else: s += 1

print(ans)