import sys
print = sys.stdout.write

def next_g(a, b):
    for i in range(1,4):
        if i not in [a, b]:
            return i

def sol(k, cur, target):
    if d[cur][-1] == k:
        print('{} {}\n'.format(cur, target))
        d[target].append(d[cur].pop())
        arr[k] = target
        return
    
    sol(k-1, cur, next_g(cur, target))
    print('{} {}\n'.format(cur, target))
    d[target].append(d[cur].pop())
    arr[k] = target
    sol(k-1, arr[k-1], target)

n = int(input())
dp = [0 for _ in range(n)]
dp[0] = 1
for i in range(1, n):
    dp[i] = dp[i-1] * 2 + 1
print(str(dp[n-1])+'\n')
if n <= 20:
    arr = [1 for x in range(n+1)]
    arr1 = [x for x in range(n, 0, -1)]
    arr2 = []
    arr3 = []
    d = {1:arr1, 2:arr2, 3:arr3}
    sol(n, 1, 3)