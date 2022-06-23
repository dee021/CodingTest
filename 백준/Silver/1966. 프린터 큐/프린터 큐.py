import sys
from collections import deque

n = int(input())
global cnt, targetrank,y
cnt = 0
def countDoc(num):
    global cnt, targetrank, y
    while num in document:
        if document[0] == num:
            if num != targetrank:
                cnt = cnt +1
                document.popleft()
            else:
                cnt = cnt +1
                document.popleft()
                if y == 0:
                    break
        else:
            document.append(document.popleft())    
        if y > 0:
            y = y -1
        else:
            y = len(document)-1       
    

for i in range(n):
    x, y = map(int, input().split())
    document = deque(map(int, sys.stdin.readline().split()))
    targetrank = document[y]
    rank = sorted(list(range(targetrank,10)),reverse=True)
    for j in rank:
        countDoc(j)
    print(cnt)
    cnt = 0
