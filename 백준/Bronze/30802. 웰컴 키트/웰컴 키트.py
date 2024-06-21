n = int(input())
arr = list(map(int, input().split()))
t, p = map(int, input().split())
ans = 0
for i in range(6):
    ans += arr[i]//t + bool(arr[i]%t)
print(ans)
print(n//p, n%p)