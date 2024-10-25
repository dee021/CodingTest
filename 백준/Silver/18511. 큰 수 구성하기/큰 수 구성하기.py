def sol(res = 0):
    global ans
    if res > n:
        return
    ans = max(ans, res)
    
    for i in range(len(nums)):
        sol(res * 10 + nums[i])

n, k = map(int, input().split())
nums = list(map(int, input().split()))
ans = 0
sol()
print(ans)