import sys
n = int(input())
stulist = [[] for _ in range(n+1)]
stulist[0] = input().split()
studict = {x:0 for x in stulist[0]}

for _ in range(n):
    name = input().split()
    for n in name:
        stulist[studict[n]].remove(n)
        stulist[studict[n]+1].append(n)
        studict[n] += 1

for keys in reversed(stulist):
    if keys == []:
        continue
    for name in sorted(keys):
        print(name, studict[name])