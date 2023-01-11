ans = 0
n = int(input())
arr = list(map(int, input().split()))
for i in arr:
    ans += sum([abs(i-x) for x in arr])
print(ans)
