import sys
input = sys.stdin.readline

n, k = map(int, input().split())
ml = [int(input()) for _ in range(n)]
l, r = 1, sum(ml)
while l <= r:
    m = (l+r)//2
    tmp = 0
    for i in range(n):
        tmp += ml[i]//m
    
    if tmp < k:
        r = m-1
    else:
        l = m+1
print(r)