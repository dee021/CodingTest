import sys

n1 = int(input())
card1 = set(map(int,sys.stdin.readline().split()))

n2 = int(input())
card2 = list(map(int,sys.stdin.readline().split()))

def isin(num):
    if num in card1:
        return '1'
    else:
        return '0'
out = list(map(isin,card2))

print(' '.join(out))