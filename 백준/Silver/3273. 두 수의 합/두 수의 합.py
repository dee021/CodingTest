n = int(input())
arr = set(map(int, input().split()))
k = int(input())
ans = 0

for m in arr:
    ans += (k-m) in arr
print(ans//2)