import sys
input = sys.stdin.readline

def sol(nums):
    res = len(nums)
    for i in range(len(nums)):
        res += i
    return res

input()
arr = list(input().strip().replace(' ', '').split('0'))
print(sum(map(sol, arr)))