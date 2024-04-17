import sys
input = sys.stdin.readline

n = int(input())
ans = [0 for _ in range(n)]
arr = list(map(int, input().split()))
stack = []
for idx in range(n-1, -1, -1):
    while stack and stack[-1][1] <= arr[idx]:
        ans[stack.pop()[0]] = idx+1
    stack.append([idx, arr[idx]])
print(*ans)