a = list(map(int, input().split()))
b = list(map(int, input().split()))
x, y = 0,0

for i in range(9):
    x += a[i]
    if x > y:
        print('Yes')
        break
    y += b[i]
else:
    print('No')