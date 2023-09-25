conv = lambda x: [ord(x[0])-ord('A'), 8-int(x[1])] # [col, row]
reconv = lambda x: ''.join([chr(ord('A')+x[0]), str(8-x[1])])
def sol(d):
    global k, s
    x, y = k
    dx, dy = dr[d]
    c, r = x + dx, y + dy
    u, v = s
    if 0<= r < 8 and 0 <= c < 8:
        if s != [c, r] or 0 <= u + dx < 8 and 0 <= v + dy < 8:
            k = [c, r]
            if s == [c, r]:
                s = [u + dx, v + dy]

dr = {'R':[1, 0], 'L':[-1, 0], 'B':[0, 1], 'T':[0, -1], 'RT':[1, -1], 'LT':[-1, -1], 'RB':[1, 1], 'LB':[-1, 1]}
arr = [[chr(c)+str(8-r) for c in range(ord('A'), ord('A')+8)] for r in range(8)]

k, s, n = input().split()
k, s = map(conv, [k, s])
for _ in range(int(n)):
    sol(input())
print(*list(map(reconv, [k, s])), sep='\n')