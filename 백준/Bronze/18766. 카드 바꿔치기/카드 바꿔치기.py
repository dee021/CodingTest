from collections import Counter
import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    card = Counter(input().strip())
    if Counter(input().strip()) == card:
        print('NOT CHEATER')
    else:
        print('CHEATER')