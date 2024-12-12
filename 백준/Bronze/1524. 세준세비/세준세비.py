from collections import deque
import sys
input = sys.stdin.readline

for _ in range(int(input())):
    input()
    n, m = map(int, input().split())
    sj = deque(sorted(map(int, input().split())))
    sb = deque(sorted(map(int, input().split())))
    
    while sj and sb:
        if sj[0] >= sb[0]:
            sb.popleft()
        else:
            sj.popleft()
    
    print(sj and 'S' or 'B')