import sys
input = sys.stdin.readline

n = int(input())
arr = sorted(map(int, input().split()))
s = sum(arr)

print(max(s, s - sum(arr[-2:]) + 2*arr[n-2]*arr[n-1], s - sum(arr[:2]) + 2*arr[0]*arr[1]))