import sys

# 1차에서 n개의 티켓이 팔렸을때, 2차에서 살 수 있는 가장 작은 수는 n+1 이하에 존재
n = set([x for x in range(1, int(sys.stdin.readline())+2)])
print(min(n-set(map(int, sys.stdin.readline().split()))))
