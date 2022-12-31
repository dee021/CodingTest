import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
ans, sell = 0, 0
for i in range(n-1, -1, -1):
    sell = max(sell, arr[i])
    ans = max(ans, sell-arr[i])
print(ans)