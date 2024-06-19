nums = input().strip()
n, i = 1, 0
while i < len(nums):
    for k in str(n):
        if nums[i] == k:
            i += 1
        if i >= len(nums):
            print(n)
            break
    n += 1