y, o = ['',1989*365], ['',2011*365]
for _ in range(int(input())):
    n, d, m, yy = input().split()
    b = int(d)+int(m)*31+int(yy)*365
    if b < o[1]:
        o = [n, b]
    if b > y[1]:
        y = [n, b]

print(y[0], o[0], sep='\n')