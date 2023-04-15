import sys
input = sys.stdin.readline

d = {'STRAWBERRY':0, 'BANANA':0, 'LIME':0, 'PLUM':0}

for _ in range(int(input())):
    f, n = input().split()
    d[f] += int(n)

print(5 in d.values() and 'YES' or 'NO')