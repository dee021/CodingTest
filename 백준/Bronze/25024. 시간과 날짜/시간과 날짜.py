import sys
input = sys.stdin.readline

days = [31 for _ in range(13)]
days[2] = 29
days[4] = days[6] = days[9] = days[11] = 30

for _ in range(int(input())):
    x, y = map(int, input().split())
    if 0 <= x < 24 and 0 <= y < 60:
        print('Yes', end=' ')
    else:
        print('No', end=' ')
    if 0 < x < 13 and 0 < y <= days[x]:
        print('Yes')
    else:
        print('No')