n = int(input())
arr = list(map(int, input().split()))
ans = [0 for _ in range(n)]

for i in range(n):
    cnt = 0
    for j in range(n):
        if arr[i] == cnt and not ans[j]:
            ans[j] = i+1
            break
        elif ans[j] == 0:
            cnt += 1
print(*ans)