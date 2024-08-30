a, b, c = map(int, input().split())
ans = '둘다틀렸근'
x1 = (-b + (b**2 - 4*a*c)**0.5)/2/a
try:
    if x1 == int(x1):
        x1 = int(x1)
        x2 = c/a/x1
        if x2 == int(x2) and x1 != x2:
            ans = '정수근'
            if x1 > 1 and x2 > 1 and bin(x1).count('1') == 1 == bin(int(x2)).count('1'):
                ans = '이수근'
except:
    pass
print(ans)