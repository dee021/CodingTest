import sys
input = sys.stdin.readline

def position(fs):
    def nullCount(y, x):
        temp = 0
        for dy, dx in dr:
            if 0 <= y + dy < n and 0 <= x + dx < n and room[y+dy][x+dx] == 0:
                temp += 1
        return temp
    
    tmp = [[0 for _ in range(n)] for _ in range(n)]
    for f in fs:
        if f not in pos:
            continue
        y, x = pos[f]
        for dx, dy in dr:
            if 0 <= y + dy < n and 0 <= x + dx < n and room[y+dy][x+dx] == 0:
                tmp[y+dy][x+dx] += 1
    
    cnt, x, y = 0,0,0
    null = -1 if room[0][0] else nullCount(0,0)
    for r in range(n):
        for c in range(n):
            if room[r][c]:
                continue
            if cnt < tmp[r][c]:
                cnt = tmp[r][c]
                y, x = r, c
                null = nullCount(r, c)
            elif cnt == tmp[r][c]:
                temp = nullCount(r, c)
                if null < temp:
                    y, x = r, c
                    null = temp
    return y, x

def answer():
    ans = 0
    for r in range(n):
        for c in range(n):
            s = room[r][c]
            cnt = 0
            for f in frds[s]:
                if abs(r-pos[f][0]) + abs(c-pos[f][1]) == 1:
                    cnt += 1
            if cnt:
                ans += 10**(cnt-1)
    return ans

dr = [[0,1], [0,-1], [1,0],[-1, 0]]
n = int(input())
room = [[0 for _ in range(n)] for _ in range(n)]
frds = {} # frds[stu] = [f1, f2, f3, f4]
pos = {} # pos[stu] = [r, c]
for _ in range(n**2):
    s, *fs = map(int, input().split())
    r, c = position(fs)
    room[r][c] = s
    frds[s] = fs
    pos[s] = [r, c]
    
print(answer())