import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
g = abs(arr[0] - arr[-1])
if g <= n-2:
    ans = min(arr[0], arr[-1]) - (n-2-g)//2 - (n-2-g)%2
else:
    ans = max(min(arr[0], arr[-1]) -1, max(arr[0], arr[-1]) - n+2)

print(ans)