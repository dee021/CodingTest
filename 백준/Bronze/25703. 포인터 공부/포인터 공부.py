print('int a;')
for i in range(int(input())):
    if i == 0:
        v = 'ptr'; b = 'a'
    else:
        b, v = v, v[:3]
        v += str(i+1)
    print('int {0}{1} = &{2};'.format('*'*(i+1), v, b))