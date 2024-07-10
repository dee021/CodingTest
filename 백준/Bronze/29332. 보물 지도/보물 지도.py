n = int(input())
line = {'L':float('inf'), 'R':-float('inf'), 'U':-float('inf'), 'D':float('inf')}
for _ in range(n):
    x, y, d = input().strip().split()
    if d == 'R':
        line[d] = max(int(x), line[d])
    elif d == 'U':
        line[d] = max(line[d], int(y))
    elif d == 'L':
        line[d] = min(int(x), line[d])
    else:
        line[d] = min(line[d], int(y))
try:
    w, h = range(line['R']+1, line['L']), range(line['U']+1, line['D'])
    print(len(w)*len(h))

except:
    print('Infinity')