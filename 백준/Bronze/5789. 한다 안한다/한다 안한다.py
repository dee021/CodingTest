for _ in range(int(input())):
    s = input()
    l = len(s)//2 - 1
    print(s[l:l+2].count(s[l])//2 and 'Do-it' or 'Do-it-Not')