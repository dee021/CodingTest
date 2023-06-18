y, k = [], []
for i, c in enumerate(input()):
    if c == 'KOREA'[len(k)]:
        k.append(i)
        if len(k) == 5:
            ans = 'KOREA';break
    if c == 'YONSEI'[len(y)]:
        y.append(i)
        if len(y) == 6:
            ans = 'YONSEI';break
print(ans)