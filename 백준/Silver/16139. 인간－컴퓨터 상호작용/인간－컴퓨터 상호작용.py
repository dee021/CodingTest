import sys
input = sys.stdin.readline
print = sys.stdout.write

string = input().strip()
cnt = {}
char = [0 for _ in range(26)]
for i in range(len(string)):
    c = string[i]
    cnt.setdefault(c, [])
    cnt[c] += [char[ord(c)-ord('a')]]*(i-len(cnt[c])+1)
    cnt[c][-1] += 1
    char[ord(c)-ord('a')] += 1

for c in cnt.keys():
    if len(cnt[c]) < len(string):
        cnt[c] += [char[ord(c)-ord('a')]] * (len(string) - len(cnt[c]))

for _ in range(int(input())):
    c, s, e = input().strip().split()
    if c in cnt:
        print(str(cnt[c][int(e)] - (cnt[c][int(s)-1] if int(s) else 0)) + '\n')
    else:
        print('0\n')