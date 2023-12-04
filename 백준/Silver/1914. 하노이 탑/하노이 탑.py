import sys
print = sys.stdout.write

def next_g(a, b):
    for i in range(1,4):
        if i not in [a, b]:
            return i

def sol(k, cur, target):
    if k == 1:
        print('{} {}\n'.format(cur, target))
        return
    
    sol(k-1, cur, next_g(cur, target))
    print('{} {}\n'.format(cur, target))
    sol(k-1, next_g(cur, target), target)

n = int(input())
dp = [0 for _ in range(n)]
dp[0] = 1
for i in range(1, n):
    dp[i] = dp[i-1] * 2 + 1
print(str(dp[n-1])+'\n')
if n <= 20:
    sol(n, 1, 3)