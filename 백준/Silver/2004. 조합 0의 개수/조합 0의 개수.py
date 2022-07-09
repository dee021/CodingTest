import sys

def count(a,b):
    n = 1
    cnt = 0
    while a >= (b**n):
        cnt += a//(b**n)
        n += 1
    return cnt

n, k = map(int, sys.stdin.readline().split())
print(min((count(n,5)-count(k,5)-count(n-k,5)),(count(n,2)-count(k,2)-count(n-k,2))))
