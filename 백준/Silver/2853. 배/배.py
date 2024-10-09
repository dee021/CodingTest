import sys
input = sys.stdin.readline

n = int(input())
term = []
input()
for _ in range(n-1):
    day = int(input()) -1
    flag = 1
    for t in term:
        if day%t == 0:
            flag = 0
            break
    if flag:
        term.append(day)
print(len(term))