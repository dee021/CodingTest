def queen(r, c):
    for i in range(8):
        dx, dy = qx[i],qy[i]
        x, y = c + dx, r + dy
        while 0 <= x < m and 0 <= y < n and type(maps[y][x]) == int:
            maps[y][x] = 0
            x += dx
            y += dy

def knight(r, c):
    for i in range(8):
        x, y = c + kx[i], r + ky[i]
        if 0 <= x < m and 0 <= y < n and maps[y][x] == 1:
            maps[y][x] = 0

qx, qy = [0,0,1,-1,1,1,-1,-1],[1,-1,0,0,1,-1,1,-1]
kx, ky =[1,1,-1,-1,2,2,-2,-2],[2,-2,2,-2,1,-1,1,-1]
n, m = map(int, input().split())
maps = [[1 for _ in range(m)] for _ in range(n)]
k = 3; kinds = [0, 'P', 'K', 'Q'] 
while k:
    arr = list(map(int, input().split()))
    for x in range(arr[0]):
        r, c = arr[2*x+1] -1, arr[2*(x+1)]-1
        maps[r][c] = kinds[k]
    k -= 1

for r in range(n):
    for c in range(m):
        if maps[r][c] == 'Q':
            queen(r, c)
        elif maps[r][c] == 'K':
            knight(r, c)
ans = 0
for r in range(n):
    ans += len([x for x in maps[r] if x == 1])
print(ans)