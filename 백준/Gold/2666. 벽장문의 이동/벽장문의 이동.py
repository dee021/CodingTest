def sol(x, y, idx = 0, res = 0):
    global ans
    if idx >= m:
        ans = min(ans, res)
        return
    if res > ans:
        return
    sol(arr[idx], y, idx+1, res + abs(x-arr[idx]))
    sol(x, arr[idx], idx+1, res + abs(y-arr[idx]))

n = int(input())
x, y = map(int, input().split())
m = int(input())
arr = [int(input()) for _ in range(m)]
ans = float('inf')
sol(x, y)
print(ans)