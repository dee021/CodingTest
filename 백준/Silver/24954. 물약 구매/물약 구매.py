import sys
input = sys.stdin.readline

def sol(price_lst, total = 0):
    global ans
    if all(visited):
        ans = min(ans, total)
        return
    
    if total >= ans:
        return
    
    for i in range(n):
        if not visited[i]:
            visited[i] = 1
            sol([max(1, price_lst[x] - dc[i][x]) for x in range(n)], total + price_lst[i])
            visited[i] = 0

n = int(input())
price = list(map(int, input().split()))
visited = [0 for _ in range(n)]
dc = [[0 for _ in range(n)] for _ in range(n)]
for i in range(n):
    for _ in range(int(input())):
        d, c = map(int, input().split())
        dc[i][d-1] = c

ans = float('inf')
sol(price)
print(ans)