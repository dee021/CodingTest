import math
f = math.factorial

def solution(n):
    o, t = n%2, n//2
    ans = 0
    for _ in range(n//2+1):
        ans += f(o+t)//f(o)//f(t)
        ans %= 1234567
        t -= 1
        o += 2
    return ans