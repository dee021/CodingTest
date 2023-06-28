import sys
input = sys.stdin.readline

p = sorted([int(input()) for _ in range(int(input()))], reverse=True)
print(sum(p)-sum(p[2::3]))