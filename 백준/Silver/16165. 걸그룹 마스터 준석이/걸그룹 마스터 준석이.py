import sys
input = sys.stdin.readline

team = {}
name = {}
n, m = map(int, input().split())
for _ in range(n):
    t = input().strip()
    team[t] = []
    for _ in range(int(input())):
        n = input().strip()
        team[t].append(n)
        name[n] = t
    team[t].sort()
for _ in range(m):
    t = input().strip()
    if not int(input()):
        print(*team[t], sep=('\n'))
    else:
        print(name[t])