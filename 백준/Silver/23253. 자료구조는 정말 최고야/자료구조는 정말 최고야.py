import sys

n, m = map(int, input().split())
for _ in range(m):
    l = int(input())
    book = list(map(int, input().split()))
    for i in range(l-1):
        if book[i] < book[i+1]:
            print('No')
            exit(0) 
print('Yes')