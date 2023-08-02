sol = lambda i: s[i:i+pl] == pn

pn = 'O'.join(['I']*(int(input())+1))
sl, pl = int(input()), len(pn)
s = input()
print(sum(list(map(sol, range(sl-len(pn)+1)))))