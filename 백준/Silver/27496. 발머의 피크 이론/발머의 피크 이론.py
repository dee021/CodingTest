import sys
input = sys.stdin.readline

n, l = map(int, input().split())
arr = list(map(int, input().split()))
ans, state = 0,0

for i in range(n):
    state += arr[i]
    if i >= l:
        state -= arr[i - l]
    if 129 <= state <= 138:
        ans += 1
print(ans)