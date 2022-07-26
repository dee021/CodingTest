n = int(input())
x = n//2
if n%2 == 1:
    txt = '*' + ' *'*x
else:
    txt = '*' + ' *'*(x-1)
if n > 1:
    txt += '\n' + ' *'*x

for _ in range(n):
    print(txt)