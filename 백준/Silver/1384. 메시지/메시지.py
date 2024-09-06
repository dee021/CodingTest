import sys
input = sys.stdin.readline

g = 0
while True:
    n = int(input())
    if not n:
        break
    if g:
        print()
    name = []
    ans = []
    for p in range(n):
        for i, m in enumerate(input().strip().split()):
            if not i:
                name.append(m)
            elif m == 'N':
                ans.append([p, (p-i+n)%n])
    g += 1
    print('Group %d' %g)
    if ans:
        print('\n'.join(['{} was nasty about {}'.format(name[ans[i][1]], name[ans[i][0]]) for i in range(len(ans))]))
    
    else:
        print('Nobody was nasty')