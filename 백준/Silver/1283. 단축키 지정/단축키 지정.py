import sys
input = sys.stdin.readline
print = sys.stdout.write

n = int(input())
options = [input().strip() for _ in range(n)]
s = set()
ans = []

for option in options:
    f = 0; temp = ''
    for i, word in enumerate(option.split()):
        if i:
                temp += ' '
        if not f and word[0].upper() not in s:
            s.add(word[0].upper())
            temp += '[' + word[0] + ']' + word[1:]
            f = 1
        else:
            temp += word
    if not f:
        temp = ''
        for i, w in enumerate(option):
            if not f and w.isalpha() and w.upper() not in s:
                temp += '[' + w + ']'
                s.add(w.upper())
                f = 1
            else:
                temp += w
    ans.append(temp)
print('\n'.join(ans))