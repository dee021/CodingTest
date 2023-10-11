import sys
input = sys.stdin.readline

ans = 0
nick = set()
for _ in range(int(input())):
    s = input().strip()
    if s == 'ENTER':
        ans += len(nick)
        nick = set()
    else:
        nick.add(s)
print(ans+len(nick))