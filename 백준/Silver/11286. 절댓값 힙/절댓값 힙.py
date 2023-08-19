import sys
input = sys.stdin.readline
import heapq

ans = []
d = {'-':[], '+':[]}
for _ in range(int(input())):
    k = int(input())
    if k: # push
        heapq.heappush(d[['-', '+'][k > 0]], k if k > 0 else -1*k)
    elif all(d.values()): # pop and not empty
        ans.append(str(heapq.heappop(d['+'])) if d['-'][0] > d['+'][0] else str(-1*heapq.heappop(d['-'])))
    elif any(d.values()):
        if d['-']:
            ans.append(str(-1*heapq.heappop(d['-'])))
        else:
            ans.append(str(heapq.heappop(d['+'])))
    else: # pop and empty
        ans.append('0')
print('\n'.join(ans))
