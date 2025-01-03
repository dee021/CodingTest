n, *nums = open(0).read().split()
nums = ''.join(nums)

for i in range(int(n)+2):
    if not nums.count(str(i)):
        print(i)
        break