import sys
input = sys.stdin.readline

n, m = map(int, input().split())
nums = [int(input()) for _ in range(n)]
nums.sort()
ans = {}
for i in range(n):
    if nums[i] not in ans:
        ans[nums[i]] = i
for _ in range(m):
    print(ans.get(int(input()), -1))