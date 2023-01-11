a = ''
for _ in range(int(input())*2-1):
    t = input()
    if t == '/':
        t += t
    a += t
print(eval(a))