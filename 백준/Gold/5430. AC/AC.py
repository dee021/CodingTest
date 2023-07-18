import sys
input = sys.stdin.readline
from collections import deque

ans = []
for _ in range(int(input())):
    order = input().strip()
    f = False
    if int(input()):
        temp = input().strip()
        arr = deque(map(int,temp[1:len(temp)-1].split(',')))
    else:
        input()
        arr = deque()
    for o in order:
        if o == 'D':
            if not arr:
                ans.append('error')
                break
            arr.pop() if f else arr.popleft()
        else:
            f = not f
    else:
        if f:
            arr.reverse()
        ans.append('['+','.join(map(str, arr))+']')
print(*ans, sep='\n')