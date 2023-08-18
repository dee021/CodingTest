conv = {'000000':'A', '001111':'B', '010011':'C', '011100':'D', '100110':'E', '101001':'F', '110101':'G', '111010':'H'}
n = int(input())
s = input()
s = [list(map(int, s[i:i+6])) for i in range(0, 6*n, 6)]
ans = ''
for i, c in enumerate(s):
    str_c = ''.join(map(str, c))
    tmp = [''.join([str(int(not(bool(c[i])))) if k == i else str(c[i]) for i in range(6)]) for k in range(6)]
    if str_c in conv:
        ans += conv[str_c]
    elif any(x in conv for x in tmp):
        for x in tmp:
            if x in conv:
                ans += conv[x]
                break
    else:
        print(i+1)
        break
else:
    print(ans)