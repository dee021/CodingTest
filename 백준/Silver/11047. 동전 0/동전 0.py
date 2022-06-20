import sys

n, k = map(int, sys.stdin.readline().split())

coin = []
for i in range(n):
    x = int(sys.stdin.readline())
    if x <= k:
        coin.append(x)
coin.sort(reverse=True)
count = idx = 0
while k != 0:
    count = count + k//coin[idx]
    k = k - (k//coin[idx] * coin[idx])
    idx = idx +1
print(count)