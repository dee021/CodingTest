import sys
from math import gcd
input = sys.stdin.readline

n = int(input())
tree = [int(input()) for _ in range(2)]
g = tree[1]-tree[0]

for i in range(n-2):
    tree.append(int(input()))
    g = gcd(g, tree[-1] - tree[-2])
print((tree[-1] - tree[0])//g + 1 - n)