from collections import Counter
import sys
input = sys.stdin.readline

n = int(input())
ans = []
for _ in range(n):
    c, *arr = map(int, input().split())
    cnt = Counter(arr)
    for k in list(cnt.keys()):
        if cnt[k] > c/2:
            ans.append(k)
            break
    else:
        ans.append('SYJKGW')
print(*ans, sep='\n')