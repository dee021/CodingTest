import sys

n = int(input())
dis = list(map(int, sys.stdin.readline().split()))
won = list(map(int, sys.stdin.readline().split()))

minidx = won.index(min(won[0:n-1]))
pay = 0; cost = 0 # pay : 지출합, cost : 구간 [시작도시,현재도시] 중 최저가

for i in range(n-1):
    if i == minidx: # 현재 위치 : 최저가 도시
        pay = pay + won[i] * sum(dis[i:n-1])
        break
    else:
        if cost:
            if cost > won[i]:
                cost = won[i]
        else: # index : 0
            cost = won[i]
        pay = pay + cost * dis[i]

print(pay)