import sys
n, k = map(int, sys.stdin.readline().split())

num = 1
den = 1

for j in range(k,0,-1):
    den = den * j

while k:
    num = num * n
    n = n - 1
    k = k -1

print(int(num/den))