import sys
input = sys.stdin.readline

j, cnt = 0, 0
costs = [0 for _ in range(1001)]
for _ in range(int(input())):
    city, cost = input().split()
    if city == 'jinju':
        j = int(cost)
    elif int(cost) > 1000:
        cnt += 1
    else:
        costs[int(cost)] += 1

print('{}\n{}'.format(j, cnt +sum(costs[j+1:])))