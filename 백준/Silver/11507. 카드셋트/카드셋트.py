cnt = lambda x: 13-len(card[x])

s = input()
card = {k:set() for k in 'PKHT'}
for i in range(0, len(s), 3):
    if s[i+1:i+3] in card[s[i]]:
        print('GRESKA')
        break
    card[s[i]].add(s[i+1:i+3])
else:
    print(*list(map(cnt, 'PKHT')))