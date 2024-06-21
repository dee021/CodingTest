import sys
input = sys.stdin.readline

def rnd(f):
    return round(1+f)-1

n = int(input())
arr = sorted([int(input()) for _ in range(n)])
s = int(n*0.15//1 + rnd(n*0.15%1))
if s:
    s = sum(arr[s:-s])/(n-2*s)
elif n and not s:
    s = sum(arr)/n
print(int(s//1 + rnd(s%1)))