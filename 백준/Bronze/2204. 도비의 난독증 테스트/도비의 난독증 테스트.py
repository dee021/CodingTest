import sys
input = sys.stdin.readline

while True:
    n = int(input())
    if not n:
        break
    word = []
    d = {}

    for _ in range(n):
        s = input().strip()
        word.append(s.lower())
        d[s.lower()] = s
    print(d[sorted(word)[0]])