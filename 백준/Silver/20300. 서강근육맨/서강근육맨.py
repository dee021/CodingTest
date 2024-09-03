import sys
input = sys.stdin.readline

n = int(input())
arr = sorted(map(int, input().split()))
ans = max(arr[0], arr[-1])
if n%2:
    n-=1
for i in range(n//2):
    ans = max(ans, arr[i] + arr[n-i-1])
print(ans)