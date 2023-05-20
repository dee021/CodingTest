n = input(); l = len(n); n = int(n)
print(l if int('1'*l) <= n else 1 if n == 0 else l-1)