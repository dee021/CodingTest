ans = 0
arr = [x**2 for x in range(1, 1001)]
n = int(input())

for b in arr:
    if arr.count(b+n):
        ans += 1
print(ans)