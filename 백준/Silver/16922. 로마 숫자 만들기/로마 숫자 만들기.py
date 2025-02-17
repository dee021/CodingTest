num = ['i', 'v', 'x', 'l']
cnt = [[], set(num)]
n = int(input())
for l in range(2, n+1):
    s = set()
    for pre in cnt[l-1]:
        for k in num:
            s.add(''.join(sorted(pre + k)))
    cnt.append(s)

conv = lambda x:d[x]
d = {'i':1, 'v':5, 'x':10, 'l':50}
print(len(set([sum(list(map(conv, x))) for x in cnt[n]])))