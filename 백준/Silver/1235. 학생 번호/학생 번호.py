import sys
input = sys.stdin.readline
from collections import Counter

cut = lambda x: x[:l]
n = int(input())
arr = [input().strip()[::-1] for _ in range(n)]
for l in range(1, len(arr[0])+1):
    cnt = Counter(map(cut, arr)).most_common(1)
    if cnt[0][1] == 1:
        print(l)
        break