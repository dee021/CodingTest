def sol(cnt, res):
    global n, x
    if cnt == c+1:
        if not n:
            n = res.replace('>', '').replace('<', '')
        else:
            x = res.replace('>', '').replace('<', '')
        return
    
    if res:
        res += arr[cnt-1]
    for k in range(10):
        if nums[k] and (not cnt or eval(res+str(k))):
            nums[k] = 0
            sol(cnt+1, res+str(k))
            nums[k] = 1

n, x = '', ''
c = int(input())
arr = input().split()
nums = [1 for _ in range(10)]
sol(0, '')
print(x, n, sep='\n')