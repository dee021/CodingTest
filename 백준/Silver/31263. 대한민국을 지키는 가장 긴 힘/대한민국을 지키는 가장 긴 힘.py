def sol(end):
    for start in range(max(0, end-3), end):
        if not nums[start:end].startswith('0') and 1 <= int(nums[start:end]) <= 641:
            return start

n = int(input())
nums = input().strip()
ans, i = 0, n

while i > 0:
    ans += 1
    i = sol(i)
print(ans)  