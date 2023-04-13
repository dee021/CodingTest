import sys
input = sys.stdin.readline

n, x, k = map(int, input().split())
for _ in range(k):
    a, b = map(int, input().split())
    if x == a:
        x = b
    elif x == b:
        x = a
print(x)