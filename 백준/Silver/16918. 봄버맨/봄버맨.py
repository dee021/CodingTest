def conv():
    res = [['O' for _ in range(c)] for _ in range(r)]
    
    for i in range(r):
        for j in range(c):
            if arr[i][j] == 'O':
                res[i][j] = '.'
                for k in range(4):
                    x, y = j + dx[k], i + dy[k]
                    if 0 <= x < c and 0 <= y < r:
                        res[y][x] = '.'
    return res

dy, dx = [0,0,1,-1],[1,-1,0,0]
r, c, t = map(int, input().split()) # 1 <= v <= 200
arr = [list(input().strip()) for _ in range(r)]

if t == 1:
    print('\n'.join([''.join([x for x in arr[i]]) for i in range(r)]))
elif t % 2 == 0:
    for _ in range(r):
        print('O'*c)
else:
    arr = conv()
    if t%4 == 3:
        print('\n'.join([''.join([x for x in arr[i]]) for i in range(r)]))
    else:
        res = conv()
        print('\n'.join([''.join([x for x in res[i]]) for i in range(r)]))