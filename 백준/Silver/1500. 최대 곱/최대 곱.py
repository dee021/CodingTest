from functools import reduce

s, k = map(int, input().split())
nums = [s//k for _ in range(k)]
i = 0
while sum(nums) < s:
    nums[i] += 1
    i += 1
print(reduce(lambda x, y:x*y, nums))