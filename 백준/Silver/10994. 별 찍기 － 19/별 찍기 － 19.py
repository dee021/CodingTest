n = int(input())

txt = []
def star(num, tlist):
    if num == 1:
        tlist.append('*')
        return tlist
    size = 1 + 4*(num-1)
    for i in range(len(tlist)):
        tlist[i] = '* ' + tlist[i] + ' *'
    tlist.insert(0, '*'*size)
    tlist.insert(1, '*' + ' '*(size-2) + '*')
    tlist.append('*' + ' '*(size-2) + '*')
    tlist.append('*'*size)
    return tlist


for i in range(1, n+1):
    txt = star(i, txt)
print('\n'.join(txt))