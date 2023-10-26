import sys
input = sys.stdin.readline

n, d, k, c = map(int, input().split())
arr = [int(input()) for _ in range(n)]
arr.extend(arr[:k])

ans = 0
for i in range(n):
    ans = max(ans, len(set(arr[i:i+k])-set([c])))
print(ans+1)