o = {'@': '*3', '%': '+5', '#': '-7'}

for _ in range(int(input())):
    c = input().split()
    for i in c[1:]:
        c[0] = str(eval(c[0]+o[i]))
    print('%0.2f' %float(c[0]))