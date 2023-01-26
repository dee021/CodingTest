n = int(input())
ans = [0 for _ in range(n)]
arr = list(map(int, input().split()))
ans[0] = s = arr[0]

for i in range(1, n):
    ans[i] = arr[i]*(i+1) - s
    s += ans[i]
print(*ans)