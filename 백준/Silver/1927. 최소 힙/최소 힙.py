import sys
import heapq
heap = []

n = int(sys.stdin.readline())

for i in range(n):
    oper = int(sys.stdin.readline())
    if oper == 0:
        sys.stdout.write(str(heapq.heappop(heap))+'\n') if len(heap) > 0 else sys.stdout.write('0\n')
    else:
        heapq.heappush(heap, oper)