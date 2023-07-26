t = input()
c = [ord(x)-96 for x in input()]
ans = ''
for i, s in enumerate(t):
    if s.isalpha():
        tmp = ord(s)-c[i%len(c)]
        if tmp < ord('a'):
            tmp += 26
        ans += chr(tmp)
    else:
        ans += s
print(ans)