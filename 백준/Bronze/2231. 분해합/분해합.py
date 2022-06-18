import sys
n = int(sys.stdin.readline())

for i in range(n):
    res = i
    for j in str(i):
        res += int(j)
    if res == n:
        print(i)
        break
    elif i == n-1:
        print(0)