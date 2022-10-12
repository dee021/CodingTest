import sys
input = sys.stdin.readline
input()
a = set(map(int, input().split()))
print(*sorted(a))