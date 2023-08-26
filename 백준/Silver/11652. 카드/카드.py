import sys
input = sys.stdin.readline

nums = {}
for _ in range(int(input())):
    k = int(input())
    if k in nums:
        nums[k] += 1
    else:
        nums[k] = 1
nums = sorted(nums.items(), key=lambda x:(-x[1], x[0]))
print(nums[0][0])