def sol(cnt, res):
    if cnt == c+1:
        res = res.replace('<', '').replace('>', '')
        ans.append(res)
        return
    
    if res:
        res += arr[cnt-1]
    for k in range(10):
        if nums[k] and (not cnt or eval(res+str(k))):
            nums[k] = 0
            sol(cnt+1, res+str(k))
            nums[k] = 1

c = int(input())
arr = input().split()
nums = [1 for _ in range(10)]
ans = []
sol(0, '')
ans.sort()
print(ans[-1], ans[0], sep='\n')