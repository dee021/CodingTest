import sys
n = int(sys.stdin.readline())

res = [0]*1000000
res[0] = 1
res[1] = 2

for i in range(n-2):
    res[i+2] = (res[i+1] + res[i])%15746

print(res[n-1])