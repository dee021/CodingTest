def sol(x, y, nums):
    if len(nums) == 6:
        res.add(nums)
        return
     
    for i in range(4):
        r, c = y + dy[i], x + dx[i]
        if 0 <= r < 5 and 0 <= c < 5:
            sol(c, r, nums+arr[r][c])

dy, dx = [0,0,1,-1],[1,-1,0,0]
res = set()
arr = [list(input().strip().split()) for _ in range(5)]
for r in range(5):
    for c in range(5):
        sol(c, r, '')
print(len(res))