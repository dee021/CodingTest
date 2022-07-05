import sys
from collections import deque

n = int(input())
num = [x for x in range(10)]
dp = [0 for x in range(10*n)]
# index = [10*(n-1) ~ 10*n] 
# : n의 길이를 갖는 수 중 각 일의 자리로 끝나는 수의 개수

dp[0] = 0
for i in range(1,10): # n = 1 일 때
    dp[i] = 1
    
for i in range(1,n):
    for j in range(10):
        if j == 0:
            dp[10*i] = dp[10*(i-1)+1]
        elif j == 9:
            dp[10*i+j] = dp[10*(i-1)+8]
        else:
            dp[10*i+j] = dp[10*(i-1)+(j-1)] + dp[10*(i-1)+(j+1)] 

res = sum(x for x in dp[10*(n-1):10*n])

print(res%1000000000) 