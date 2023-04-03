import sys
input = sys.stdin.readline

s = [0, 0] # d, p
for _ in range(int(input())):
    s[input().strip() == 'P'] += 1
    if abs(s[0]-s[1]) == 2:
        break
print(*s, sep=':')