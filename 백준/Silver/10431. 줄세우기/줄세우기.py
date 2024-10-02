from bisect import bisect_left, insort_left
import sys
input = sys.stdin.readline

for _ in range(int(input())):
    tc, *arr = map(int, input().split())
    lst = [arr[0]]
    cnt = 0
    for h in arr[1:]:
        cnt += len(lst) - bisect_left(lst, h)
        insort_left(lst, h)
    print(tc, cnt)