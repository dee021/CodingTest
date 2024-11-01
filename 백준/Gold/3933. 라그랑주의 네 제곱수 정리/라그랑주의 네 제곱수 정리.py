import sys
input = sys.stdin.readline

big = 2**15
dp = [0 for _ in range(big)]

for a in range(1, int(big**0.5)+1):
    x = a*a
    dp[a*a] += 1
    for b in range(1, a+1):
        if x+b*b >= big:
            break
        y = x+b*b
        dp[y] += 1
        for c in range(1, b+1):
            if y + c*c >= big:
                break
            z = y + c*c
            dp[z] += 1
            for d in range(1, c+1):
                if z + d*d >= big:
                    break
                dp[z + d*d] += 1

while True:
    n = int(input())
    if not n:
        break
    print(dp[n])