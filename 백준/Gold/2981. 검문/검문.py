import sys
import math
from functools import reduce

n = int(input())
nums = [int(sys.stdin.readline()) for _ in range(n)]
nums.sort()
for i in range(n-1):
    nums[i] = nums[i+1] - nums[i]
nums.pop()
nums = reduce(lambda x, y: math.gcd(x, y), nums)
ans = set()

for i in range(2, nums+1):
    if i > nums**0.5 +1:
        ans.add(nums)
        break
    if nums%i == 0:
        ans.add(i)
        ans.add(nums//i)

print(*sorted(ans))