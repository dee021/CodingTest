import sys
for line in sys.stdin:
    a, b = map(int, line.split())
    if not(a or b):
        break
    print('Yes' if a>b else 'No')