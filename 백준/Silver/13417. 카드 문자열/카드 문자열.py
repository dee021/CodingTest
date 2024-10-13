from functools import reduce
import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    cards = input().strip().split()
    res = reduce(lambda x, y: x + y if x < y else y + x, cards, '')
    print(res)