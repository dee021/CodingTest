import sys
input = sys.stdin.readline

n = int(input())
arr = sorted([int(input()) for _ in range(n)], reverse=True)

for i in range(n-2):
    a, b, c = arr[i:i+3]
    if a < b+c:
        print(a+b+c)
        break
else:
    print(-1)