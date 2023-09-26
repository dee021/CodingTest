from collections import deque

def sol():
    dx, dy = dr[0]
    if dx:
        hj[0] += dx
        if not (w[0] <= hj[0] <= w[1]):
            if w[0] > hj[0]:
                w[0] -= 1
                for r in range(h[0], h[1]+1):
                    rows[r].insert(0, '#')
            else:
                w[1] += 1
                for r in range(h[0], h[1]+1):
                    rows[r].append('#')
    else:
        hj[1] += dy
        if not (h[0] <= hj[1] <= h[1]):
            if h[0] > hj[1]:
                h[0] -= 1
            else:
                h[1] += 1
            rows[hj[1]] = ['#' for _ in range(w[1]-w[0]+1)]
    rows[hj[1]][hj[0]-w[0]] = '.'

dr = deque([[0,1], [-1, 0], [0, -1], [1, 0]]) # elem = [dc, dr] / order = 'L'
rows = {0:['.']}
hj, w, h = [0,0], [0,0], [0,0] # hj = [c, r] / w, h : range of map

input()
for d in input():
    if d == 'F':
        sol()
    else:
        dr.rotate([1, -1][d == 'R'])
for r in range(h[0], h[1]+1):
    print(''.join(rows[r]))