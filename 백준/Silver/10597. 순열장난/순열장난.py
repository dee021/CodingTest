def sol(s, res, start):
    if not s:
        print(' '.join(res))
        exit(0)
        return
    
    for i in range(1,3):
        if int(nums[start:start+i]) in s:
            sol(s - set([int(nums[start:start+i])]), res + [nums[start:start+i]], start+i)

nums = input()
if len(nums) <= 9:
    print(' '.join(list(nums)))
else:
    k = 9 + (len(nums) - 9)//2
    sol(set(range(1, k+1)), [], 0)