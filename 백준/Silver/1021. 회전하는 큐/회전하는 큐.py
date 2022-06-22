from collections import deque

n, m = map(int, input().split())
target = list(map(int, input().split()))
num = deque([x for x in range(1,n+1)])
global cnt
cnt = 0

def oper1():
    num.popleft()

def oper2(n):
    global cnt
    for j in range(n):
        cnt = cnt +1
        num.append(num.popleft())

def oper3(n):
    global cnt
    for j in range(n):
        cnt = cnt + 1
        num.insert(0, num.pop())

for i in target:
    idx = num.index(i)
    k = (len(num) - 1) / 2
    if idx <= k:
        oper2(idx)
    else:
        oper3(len(num)-idx)
    oper1()

print(cnt)