nums = list(map(int, input()))
if 0 not in nums:
    print(-1)
    exit(0)
elif sum(nums)%3:
    print(-1)
    exit(0)

nums.sort(reverse=True)
print(*nums, sep='')