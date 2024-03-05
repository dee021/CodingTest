def conv(n, k):
    if k == 10:
        return str(n)
    res = ''
    for e in range(13, -1, -1):
        if n // k**e:
            res += str(n // k**e)
            n %= k**e
        elif res:
            res += '0'
    return res

def solution(n, k):
    nums = [int(x) for x in conv(n,k).split('0') if x]
    nums = sorted([x for x in nums if (x > 2 and x % 2) or x == 2])
    if not nums:
        return 0
    M = max(nums)
    for p in range(3, M+1, 2):
        if p**2 > M:
            break
        for idx in range(len(nums)-1, -1, -1):
            if nums[idx] <= p:
                break
            if nums[idx] % p == 0:
                nums.pop(idx)
    return len(nums)