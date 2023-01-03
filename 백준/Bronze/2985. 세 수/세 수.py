o = ['+', '-', '*', '/']
a, b, c = input().split()

for i in o:
    if eval(a+i+b) == int(c):
        print(a+i+b+'='+c)
    elif int(a) == eval(b+i+c):
        print(a+'='+b+i+c)