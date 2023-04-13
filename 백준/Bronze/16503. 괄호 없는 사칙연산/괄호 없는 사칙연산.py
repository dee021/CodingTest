s = input().split()

def sol(x, o, y):
    if o == '/':
        x, y = map(int, [x, y])
        return x//y if x >= 0 and y >= 0 else -1*(abs(x)//abs(y))
    return eval(x+o+y)
    
v1 = sol(str(sol(*s[:3])), s[3], s[4])
v2 = sol(s[0], s[1], str(sol(*s[2:])))
print(min(v1, v2), max(v1, v2), sep='\n')