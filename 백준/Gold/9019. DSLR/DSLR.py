from collections import deque
import sys
input = sys.stdin.readline

def bfs(a, b):
    visited = [0 for _ in range(10000)]
    deq = deque([[a, '']])
    while deq:
        n, path = deq.popleft()
        for i in range(4):
            if i == 0: # D
                t = (n*2) % 10000
                o = 'D';
            elif i == 1: # S
                if n == 0:t = 9999
                else: t = n-1
                o = 'S'
            elif i == 2: # L
                t = (n*10)%10000 + (n//1000);
                o = 'L';
            else : # R
                t = (n%10*1000) + n//10;
                o = 'R';

            if n != t != a and not visited[t]:
                visited[t] = visited[n]+1
                deq.append([t, path+o])
            if t == b:
                return path+o

answer = ''
for _ in range(int(input())):
    a, b = map(int, input().split())
    answer += bfs(a, b)+"\n"

print(answer, end='')