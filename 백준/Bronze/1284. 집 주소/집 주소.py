while True:
    n = input()
    if not int(n): break
    ans = len(n) + 1
    ans += n.count('0') * 4
    n = n.replace('0','')
    ans += n.count('1') * 2
    n = n.replace('1','')
    print(ans + len(n) * 3)