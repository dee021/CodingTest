import sys

total = int(sys.stdin.readline())
n = int(sys.stdin.readline())
cost = 0
for i in range(n):
    a, b = map(int, sys.stdin.readline().split())
    cost += a * b
sys.stdout.write('Yes') if total == cost else sys.stdout.write('No')