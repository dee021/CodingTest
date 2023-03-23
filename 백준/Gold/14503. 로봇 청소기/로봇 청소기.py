import sys
input = sys.stdin.readline

def nextRoom(r, c, d):
    if not(0 <= r < n) or not (0 <= c < m):
        return False
    if room[r][c]:
        return False
    return True

def sol(r, c, d):
    dr = [(r, c-1, 3), (r-1, c, 0), (r, c+1, 1), (r+1, c, 2)]
    back = [(r+1, c, 0), (r, c-1, 1), (r-1, c, 2), (r, c+1, 3)]
    ans, tmpd = 0, d
    if not(0 <= r < n) or not (0 <= c < m):
        return ans
    if not room[r][c]: # 0
        room[r][c] = 2
        ans += 1
    elif room[r][c] == 1: # 1
        return ans
    while not nextRoom(*dr[tmpd]):
        tmpd -= 1
        if tmpd < 0:
            tmpd = 3
        if tmpd == d: # 빈 칸 X
            return ans + sol(*back[d])
    return ans + sol(*dr[tmpd])

n, m = map(int, input().split())
r, c, d = map(int, input().split())
room = [list(map(int, input().split())) for _ in range(n)]  

print(sol(r, c, d))