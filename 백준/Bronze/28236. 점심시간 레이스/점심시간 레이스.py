import sys
input = sys.stdin.readline

n, m, k = map(int, input().split())
rooms = [float('inf')]
ans = 0

for i in range(1, k+1):
    r, c = map(int, input().split())
    rooms.append(r+m-c)
    if rooms[ans] > rooms[-1]:
        ans = i
print(ans)