def cnt():
    global ans
    for i in range(n):
        m = 1
        for j in range(n-1):
            if arr[i][j] == arr[i][j+1]:
                m += 1
            else:
                m = 1
            ans = max(ans, m)
        
        m = 1
        for j in range(n-1):
            if arr[j][i] == arr[j+1][i]:
                m += 1
            else:
                m = 1
            ans = max(ans, m)

ans = 0
n = int(input())
arr = [list(input()) for _ in range(n)]

for i in range(n):
    for j in range(n-1):
        arr[i][j], arr[i][j+1] = arr[i][j+1], arr[i][j]
        cnt()
        arr[i][j], arr[i][j+1] = arr[i][j+1], arr[i][j]
        
        if i+1 < n:
            arr[i][j], arr[i+1][j] = arr[i+1][j], arr[i][j]
            cnt()
            arr[i][j], arr[i+1][j] = arr[i+1][j], arr[i][j]
print(ans)