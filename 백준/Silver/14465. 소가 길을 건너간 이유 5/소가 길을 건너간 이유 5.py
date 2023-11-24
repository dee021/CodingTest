import sys
input = sys.stdin.readline

n, k, b = map(int, input().split())
arr = [0 for i in range(n)]
for _ in range(b):
    arr[int(input())-1] = 1

l, r = 0, k
s = sum(arr[0:r])
ans = s
while r < n:
    s += arr[r] - arr[l]
    ans = min(ans, s)
    r += 1; l += 1
print(ans)