def sol(cnt, res):
    global ans
    
    def check(r, c):
        cost = 0
        for i in range(5):
            x, y = c + flower[i][1], r + flower[i][0]
            if 0 <= x < n and 0 <= y < n and sell[y][x] == 0:
                cost += arr[r + flower[i][0]][c + flower[i][1]]
                continue
            else:
                return 0, 0
        return 1, cost
    
    def change(r, c):
        for i in range(5):
            sell[r + flower[i][0]][c + flower[i][1]] ^= 1
    
    if cnt == 3:
        ans = min(ans, res)
        return
    
    for r in range(1, n-1):
        for c in range(1, n-1):
            check_res, cost = check(r, c)
            if check_res:
                change(r, c)
                sol(cnt + 1, res + cost)
                change(r, c)

flower = [[0,0], [1,0], [0,1], [-1,0],[0,-1]]
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
sell = [[0] * n for _ in range(n)]
ans = float('inf')
sol(0, 0)
print(ans)