import sys
input = sys.stdin.readline

while True:
    b = input().strip()
    if b == '#':
        break
    p = b[-1]
    b = list(map(int, b[:-1]))
    b.append(0 if ['e', 'o'].index(p) == sum(b)%2 else 1)
    print(*b, sep='')