import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split())) + [0]
ans = 0
for i in range(n-1, -1, -1):
    arr[i] = min(arr[i], arr[i+1] + 1)
    ans += arr[i]
print(ans)