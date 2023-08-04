import sys
input = sys.stdin.readline

while True:
    s = input().strip().lower()
    if s == '#':
        break
    ans = 0
    for c in set(s):
        if c.isalpha():ans+=1
    print(ans)