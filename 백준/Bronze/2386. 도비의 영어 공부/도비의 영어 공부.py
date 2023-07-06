import sys
input = sys.stdin.readline

while True:
    s = input().strip().lower()
    if s == '#':
        break
    c, s = s.split(' ',1)
    print(c, s.count(c))