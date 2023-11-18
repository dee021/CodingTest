def sol(idx, s):
    nums.add(s)

    for i in range(idx, n):
        sol(i+1, s+arr[i])

n = int(input())
arr = list(map(int, input().split()))
nums = set()
sol(0, 0)

for i in range(1, sum(arr)+2):
    if i not in nums:
        print(i)
        break