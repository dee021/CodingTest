from collections import Counter

n = int(input())
hg = input().replace(' ', '').replace('1','U').replace('2','D')
hg_d = Counter(hg)
u, d = map(int, input().split())
if hg_d['U'] < u:
    hg = hg.replace('3','U',u-hg_d['U'])
    hg_d = Counter(hg)
if hg_d['D'] < d:
    hg = hg.replace('3','D')
    hg_d['D'] += hg_d['3']
print('YES', hg, sep='\n') if u==hg_d['U'] and d == hg_d['D'] else print('NO')