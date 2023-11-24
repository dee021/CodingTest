import sys
input = sys.stdin.readline

def turn(o):
    if o == 'R':
        return (idx + 1) % 4
    return (idx + 3) % 4

def go(o):
    if o == 'B':
        return cur_x - dx[idx], cur_y - dy[idx]
    return cur_x + dx[idx], cur_y + dy[idx]

dy, dx = [1,0,-1,0], [0,1,0,-1] # [N, E, S, W]

for _ in range(int(input())):
    idx = 0
    min_x, min_y, max_x, max_y, cur_x, cur_y = 0,0,0,0,0,0
    for o in input().strip():
        if o in ['F', 'B']:
            cur_x, cur_y = go(o)
            min_x, max_x = min(min_x, cur_x), max(max_x, cur_x)
            min_y, max_y = min(min_y, cur_y), max(max_y, cur_y)
        else:
            idx = turn(o)
    print((max_x-min_x)*(max_y-min_y))