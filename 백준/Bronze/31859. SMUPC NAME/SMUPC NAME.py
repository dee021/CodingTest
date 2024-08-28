n, s = input().strip().split()
l, s = len(s), [s[i] for i in range(len(s)) if i == s.index(s[i])]
s = str(int(n) + 1906) + ''.join(s) + str(4+l-len(s))
print('smupc_'+s[::-1])