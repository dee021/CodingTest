import sys
input = sys.stdin.readline

def check(num, k, s, b):
    sb = set(k) & set(num)
    if len(sb) != s+b:
        return False
    s_cnt = 0
    for i in range(3):
        if k[i] == num[i]:
            s_cnt += 1
    if s_cnt != s:
        return False
    return True

nums = set([str(x)+str(y)+str(z) for x in range(1, 10) for y in range(1,10) for z in range(1,10) if x!=y and y!=z and z!=x])

for _ in range(int(input())):
    k, s, b = input().strip().split()
    s, b = int(s), int(b)
    for num in list(nums):
        res = check(num, k, s, b)
        if not res:
            nums.discard(num)
print(len(nums))