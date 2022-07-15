import sys

n = int(sys.stdin.readline())
white, blue = 0, 0
p = []

for i in range(n):
    p.extend(list(map(int, sys.stdin.readline().split())))

def sol(lst):
    global white, blue
    m = int(len(lst)**0.5)
    size = m//2
    if sum(lst) == len(lst):
        blue += 1
    elif sum(lst) == 0:
        white += 1
    else: # 분할
        def divide():
            one = list(); two = list(); three = list(); four = list()
            for j in range(0, m*m//2, m):
                one.extend(lst[j:j+size])
                two.extend(lst[j+size:j+(size*2)])
            for j in range(m*m//2, m*m, m):
                three.extend(lst[j:j+size])
                four.extend(lst[j+size:j+(size*2)])
            return [one, two, three, four]
        lst = divide()
        lst = list(map(sol, lst))
    return white, blue

white, blue = sol(p)
print(white, blue, sep='\n')