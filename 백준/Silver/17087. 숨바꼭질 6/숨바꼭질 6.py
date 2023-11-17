import sys
import math
input = sys.stdin.readline

elements = lambda x : abs(int(x)-s)

n, s = map(int, input().split())
arr = list(map(elements, input().split()))
ans = arr[-1]
for i in range(n-1):
    ans = math.gcd(ans, arr[i])
print(ans)