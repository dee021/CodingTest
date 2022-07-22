n = int(input())

for i in range(1, n+1):
    txt = ' '*(n-i) + '*'*i
    print(txt)
for i in range(n-1, 0, -1):
    txt = ' '*(n-i) + '*'*i
    print(txt)