import sys
input = sys.stdin.readline
from math import factorial as ft

def sol(n): 
    ans = 0
    for i in range(0, n//2+1):
        ans += ft(n-2*i+i)//ft(i)//ft(n-2*i)*2**i
    return ans

while True:
    try:
        n = int(input())
    except:
        break
    print(sol(n))