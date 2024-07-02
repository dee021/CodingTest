import sys
from collections import Counter
input = sys.stdin.readline

n = int(input())
cnt = Counter(input().strip().split())
ans = 'YES'
for k in cnt.keys():
    if cnt[k] > (n+1)//2:
        ans = 'NO'
print(ans)