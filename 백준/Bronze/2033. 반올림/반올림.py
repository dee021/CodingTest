n = input()
l = len(n)-1
n = int(n)

for i in range(l):
    n *= 10**(-1)
    if str(n)[-1] == '5':
        n += 0.1
    n = round(n)
    
print(n*10**l)