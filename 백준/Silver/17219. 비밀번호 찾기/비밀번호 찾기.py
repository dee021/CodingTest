import sys
n, m = map(int, sys.stdin.readline().split())

site = dict()
for i in range(n):
    key, value = sys.stdin.readline().split()
    site[key] = value

for i in range(m):
    print(site[sys.stdin.readline().strip()])