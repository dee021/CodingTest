from heapq import heappop, heappush

import sys
input = sys.stdin.readline

for _ in range(int(input())):
    d = dict()
    minq = []
    maxq = []
    for _ in range(int(input())):
        o, n = input().split()
        n = int(n)
        if (o == 'I'):
            heappush(minq, n)
            heappush(maxq, -n)
            d[n] = d.setdefault(n, 0) + 1
        else: # o == 'D'
            if n == 1: # pop(max)
                while (maxq and (k := -heappop(maxq)) not in d):
                    continue
                if not maxq:
                    minq = []
                    d = {}
                    continue;
                d[k] -= 1
                if not d[k]: d.pop(k)
            else: # pop(min)
                while (minq and (k := heappop(minq)) not in d):
                    continue
                if not minq:
                    maxq = []
                    d = {}
                    continue;
                d[k] -= 1
                if not d[k]: d.pop(k)
    if d:
        while (v1 := -heappop(maxq)) not in d:
            pass
        while (v2 := heappop(minq)) not in d:
            pass
        print(v1, v2)
    else: print("EMPTY")