n = int(input())

for i in range(n, 0, -1):
    txt = ' '*(n-i) + '*'*(2*i-1)
    print(txt)


for i in range(2, n+1):
    txt = ' '*(n-i) + '*'*(2*i-1)
    print(txt)