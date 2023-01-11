import sys
input = sys.stdin.readline

ans = 0
n = int(input())
arr = list(map(int, input().split()))
for i in range(n-1):
    for j in range(i+1, n):
        ans += abs(arr[i]-arr[j])
print(ans*2)