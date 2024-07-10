import sys
input = sys.stdin.readline

n, s = input().strip().split()
cnt, key, log = 0, '', {}

for _  in range(int(n)):
    nick, ans = input().strip().split()
    log.setdefault(ans, []).append(nick)
    if nick == s:
        key = ans

for nick in log[key]:
    if nick == s:
        break
    cnt += 1
print(cnt)