import sys
input = sys.stdin.readline

s = []
n = int(input())
for _ in range(n):
    s.append(input().strip())

if n == 1:
    print(s[0])
    exit(0)

for _ in range(n-1):
    x = s.pop(0)
    y = s.pop(0)
    o = ''
    for i in range(len(x)):
        if x[i] != '?' and x[i] != y[i]:
            o += '?'
        else:
            o += x[i]
    s.append(o)
print(o)