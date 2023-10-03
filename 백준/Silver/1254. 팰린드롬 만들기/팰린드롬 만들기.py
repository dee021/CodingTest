s = input()
f = ''
idx = 0; ans = len(s)

while idx < len(s):
    tmp = s + f[::-1]
    i = 0
    while i <= ans - i -1:
        if tmp[i] != tmp[ans-i-1]:
            break
        i += 1
    else:
        print(ans)
        break
    f += s[idx]
    idx += 1
    ans += 1