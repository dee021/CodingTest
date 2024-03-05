import sys
input = sys.stdin.readline

sigma = lambda x: x*(x+1)//2

dp = [0,1]
k = 1
while dp[-1] < 2**31:
    dp.append(sigma(k) + sigma(k-1)+1)
    dp.append(sigma(k)*2 + 1)
    k += 1
    
for _ in range(int(input())):
    s, e = map(int, input().split())
    dist = e - s
    for i in range(len(dp)):
        if dp[i] <= dist < dp[i+1]:
            print(i)
            break