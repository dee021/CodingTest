import sys
from collections import Counter

n = int(input())
card1 = list(map(int,sys.stdin.readline().split()))
carddict = Counter(card1)

m = int(input())
card2 = list(map(int,sys.stdin.readline().split()))

def ansCnt(num):
    if num in carddict:
        return str(carddict[num])
    else:
        return '0'
card2 = list(map(ansCnt,card2))
print(' '.join(card2))