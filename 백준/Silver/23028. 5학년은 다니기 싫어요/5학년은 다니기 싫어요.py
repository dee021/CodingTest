n, a, b = map(int, input().split())
u, v = 0,0
for i in range(n+1, 9):
    tmp = 6
    x, y = map(int, input().split())
    u += x
    tmp -= x
    if tmp > 0:
        v += min(tmp, y)
x = a + u*3
y = b + u*3 + v*3
if x >= 66 and y >= 130:
    print('Nice')
else:
    print('Nae ga wae')