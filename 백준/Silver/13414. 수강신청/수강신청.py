import sys
input = sys.stdin.readline

k, l = map(int, input().split())
order = {}

for i in range(l):
    order[input().strip()] = i
order = sorted([[v, k] for k, v in order.items()])
for i in range(min(k, len(order))):
    print(order[i][1])
    