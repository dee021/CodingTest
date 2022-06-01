import sys

n, m = map(int, input().split())
a = set(map(int,sys.stdin.readline().split()))
b = set(map(int,sys.stdin.readline().split()))

print(len([i for i in a if i not in b]) + len([i for i in b if i not in a]))
