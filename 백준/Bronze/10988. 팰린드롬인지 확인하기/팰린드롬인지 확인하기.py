s = input(); l = len(s) -1
for i in range(l+1):
    if i >= l:
        print(1)
        break
    if s[i] != s[l]:
        print(0)
        break
    l -= 1