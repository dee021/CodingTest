import sys
input = sys.stdin.readline

arr = sorted([float(input()) for _ in range(int(input()))])
for i in range(7):
    print('%0.3f' %arr[i])