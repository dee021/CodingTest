import sys
input = sys.stdin.readline
from collections import Counter

def calc(x, y):
    return sum(map(int, list(str(x*y))))

n = int(input())
nums = Counter(map(int, input().split()))
keys = list(nums.keys())
n = len(keys)
ans = 0

for x in range(n):
    if nums[keys[x]] > 1:
        ans = max(ans, calc(keys[x], keys[x]))
    for y in range(x+1, n):
        ans = max(ans, calc(keys[x], keys[y]))
print(ans)