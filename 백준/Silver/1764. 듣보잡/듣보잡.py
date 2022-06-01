import sys

n, m = map(int, input().split())
nohear = set();nosee=set()
for i in range(n):
    nohear.add(sys.stdin.readline().strip())

for i in range(m):
    nosee.add(sys.stdin.readline().strip())

unknown = sorted([i for i in nohear if i in nosee])

print(len(unknown))
print('\n'.join(unknown))