import sys
from itertools import permutations as perm

def cases(op):
    global num, n
    res = num[0]
    for idx in range(n-1):
        if op[idx] == '+':
            res += num[idx+1]
        elif op[idx] == '-':
            res -= num[idx+1]
        elif op[idx] == '*':
            res *= num[idx+1]
        else:
            res /= num[idx+1]
            res = int(res)
    return res

n = int(sys.stdin.readline())
num = list(map(int, sys.stdin.readline().split()))
nop = list(map(int, sys.stdin.readline().split()))
oper = []
for idx, op in enumerate(['+','-','*','//']):
    for _ in range(nop[idx]):
        oper.append(op)

case = set(perm(oper, n-1)) # 가능한 모든 연산 순서

case = list(map(cases, case)) # 각 경우를 계산
print(max(case), min(case), sep = '\n')