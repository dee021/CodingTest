import sys

for line in sys.stdin:
    a, b, c = map(int, line.split())
    if c - b - 1 or b - a - 1:
        print(max(b-a, c-b) -1)
    else:
        print(0)