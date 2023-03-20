import sys
input = sys.stdin.readline

n = int(input())
white, blue = 0, 0
p = []

for i in range(n):
    p.extend(list(map(int, input().split())))

def sol(lst):
    def divide():
        one = list(); two = list(); three = list(); four = list()
        for j in range(0, m*m//2, m):
            one.extend(lst[j:j+size])
            two.extend(lst[j+size:j+(size*2)])
            three.extend(lst[m*m//2+j:m*m//2+j+size])
            four.extend(lst[m*m//2+j+size:m*m//2+j+(size*2)])
        return [one, two, three, four]
    global white, blue
    m = int(len(lst)**0.5)
    size = m//2
    s = set(lst)
    if len(s) == 1:
        if 0 in lst:
            white += 1
        else:
            blue += 1
    else:
        lst = divide()
        lst = list(map(sol, lst))
    return white, blue

white, blue = sol(p)
print(white, blue, sep='\n')