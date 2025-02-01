from math import factorial

def solution(n, k):
    
    answer = []
    nums = [x+1 for x in range(n)]
    
    while nums:
        idx = (k-1)//factorial(len(nums)-1)
        answer.append(nums[idx])
        nums.remove(answer[-1])
        k %= factorial(len(nums))
    return answer