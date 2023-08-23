k = int(input())
c = input()
d = [list(c[i*k:min(i*k+k, len(c))][::-1] if i%2 else c[i*k:min(i*k+k, len(c))]) for i in range(len(c)//k)]
print(''.join([''.join(list(x)) for x in zip(*d)]))