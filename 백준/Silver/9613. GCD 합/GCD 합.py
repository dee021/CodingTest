import math
from itertools import combinations as cb

for _ in range(int(input())):
    n, *nums = map(int, input().split())
    ans = 0
    for a, b in list(cb(nums, 2)):
        ans += math.gcd(a, b)
    print(ans)