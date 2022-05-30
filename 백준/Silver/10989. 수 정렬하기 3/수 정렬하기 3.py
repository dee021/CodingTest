import sys

n = int(input())
count = [0]*10000

for i in range(n):
    idx = int(sys.stdin.readline())
    count[idx-1] += 1

for i in range(1,10001):
    for j in range(count[i-1]):
        print(i)
