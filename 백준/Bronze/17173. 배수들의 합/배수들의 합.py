n, m = map(int, input().split())
ks = list(map(int, input().split()))
nums = set()

for k in ks:
    for i in range(501):
        if k*i > n:
            break
        nums.add(k*i)
print(sum(nums))