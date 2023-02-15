def sol(f):
    a, b = str(f).split('.')
    if b[0] == '5' and int(a)%2 == 0:
        return round(f) + 1
    return round(f)

t = int(input())
print(sol(t**2/4))