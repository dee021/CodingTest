def solution(park, routes):
    h, w = len(park), len(park[0])
    for r, col in enumerate(park):
        if 'S' in col:
            c = col.index('S')
            break
    
    for o in routes:
        ans = [r, c]
        d, n = o.split()
        for i in range(int(n)):
            if d in ['N', 'S']:
                r += [-1,1][d == 'S']
            else:
                c += [-1,1][d == 'E']
            if not(0 <= r < h) or not(0<= c < w):
                r, c = ans
                break
            if park[r][c] == 'X':
                r, c = ans
                break
    
    return [r, c]