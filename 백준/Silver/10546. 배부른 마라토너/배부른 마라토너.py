import sys
input = sys.stdin.readline

n = int(input())
names = {}
for _ in range(n):
    name = input().strip()
    names[name] = names.setdefault(name, 0) + 1
for _ in range(n-1):
    name = input().strip()
    if names[name] > 1:
        names[name] -= 1
    else:
        names.pop(name)
print(*names.keys())