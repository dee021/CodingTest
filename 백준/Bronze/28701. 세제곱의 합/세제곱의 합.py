a, b = 0,0
for i in range(1, int(input())+1):
    a += i
    b += i**3
print(a, a**2, b, sep='\n')