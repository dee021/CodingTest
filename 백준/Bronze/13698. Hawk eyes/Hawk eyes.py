def sol(c):
    if c == 'A': a, b = 0,1
    elif c == 'B': a, b = 0,2
    elif c == 'C': a, b = 0,3
    elif c == 'D': a, b = 1,2
    elif c == 'E': a, b = 1,3
    else:  a, b = 2,3
    
    cup[a], cup[b] = cup[b], cup[a]
    
    
cup = [1,0,0,2]
for c in input().strip():
    sol(c)
print(cup.index(1)+1)
print(cup.index(2)+1)