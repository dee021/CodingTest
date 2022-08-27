import sys

n = int(input())
cost = list(map(int, sys.stdin.readline().split()))
print(sum(cost) - max(cost))