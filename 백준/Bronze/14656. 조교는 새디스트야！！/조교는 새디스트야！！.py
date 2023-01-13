ans = 0
n = int(input())
arr = list(map(int, input().split()))
for i in range(n):
    if arr[i] != i+1:
        ans += 1
print(ans)