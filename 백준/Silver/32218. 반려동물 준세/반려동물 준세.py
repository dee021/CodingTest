from bisect import bisect_right, insort_right
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))
b = [0 for _ in range(n)]
cnt = 0

while True:
    cnt += 1
    number = []
    for i in range(n-1, -1, -1):
        b[i] = len(number)-bisect_right(number, a[i])
        insort_right(number, a[i])
    if a == b:
        break
    a = b.copy()
    
print(cnt)