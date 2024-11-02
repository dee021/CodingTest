import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
m, s = max(arr), sum(arr)
print((n-1)*m + s-m)