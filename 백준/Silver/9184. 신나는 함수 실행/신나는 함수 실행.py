import sys
from collections import deque

dp = deque([[[-1 for _ in range(21)] for _ in range(21)] for _ in range(21)])


def w(i, j, k, wlist = dp):
    if wlist[i][j][k] != -1:
        return wlist[i][j][k]
    else:
        if 0 in [i,j,k]:
            wlist[i][j][k] = 1
        elif i < j and j < k:
            wlist[i][j][k] = w(i,j,(k-1)) + w(i,(j-1),(k-1)) - w(i,j-1,k)
        else:
            wlist[i][j][k] = w((i-1),j,k) + w((i-1),(j-1),k) + w((i-1),j,(k-1)) - w((i-1),(j-1),(k-1))
        return wlist[i][j][k]

while True:
    a,b,c = map(int, sys.stdin.readline().split())
    if a == -1 == b == c:
        break
    if any(0 >= x for x in [a,b,c]):
        print('w({0}, {1}, {2}) = {3}'.format(a,b,c,w(0,0,0,dp)))
    elif any(20 < x for x in [a,b,c]):
        print('w({0}, {1}, {2}) = {3}'.format(a,b,c,w(20,20,20,dp)))
    else:
        print('w({0}, {1}, {2}) = {3}'.format(a,b,c,w(a,b,c,dp)))
 