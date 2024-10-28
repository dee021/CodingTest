def sol(cost, idx = 0, res = 0):
    global benefit, ans
    if idx >= n:
        if res > benefit:
            benefit = res
            ans = cost
        elif res == benefit:
            ans = min(cost, ans)
        return
    
    if res + cost * (n-idx) < benefit:
        return
    
    if arr[idx][0] >= cost and cost > arr[idx][1]:
        sol(cost, idx+1, res + cost - arr[idx][1])
    else:
        sol(cost, idx+1, res)

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
ans, benefit = 0, 0

for c in list(set([list(x) for x in zip(*arr)][0])):
    sol(c)
print(ans)