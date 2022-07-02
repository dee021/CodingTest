import sys
from collections import deque
sys.setrecursionlimit(1000000)

num = deque([-1]*10000001)
num[1] = 0
num[2] = num[3] = 1

def oper(num,nlist):
    if nlist[num] != -1:
        return nlist[num]
    nlist[num] = min(oper(num//3,nlist)+(num%3), oper(num//2,nlist)+(num%2)) + 1
    return nlist[num]

n = int(sys.stdin.readline())
print(oper(n,num))