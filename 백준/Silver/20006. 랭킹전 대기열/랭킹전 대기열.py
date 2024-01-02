import sys
import heapq
input = sys.stdin.readline

p, m = map(int, input().split())
room = [] # index = created_order / value = [level, player_array]
for i in range(p):
    l, n = input().strip().split()
    l, f = int(l), False
    for j in range(len(room)):
        if l - 10 <= room[j][0] <= l + 10 and len(room[j][1]) < m:
            f = True
            heapq.heappush(room[j][1], [n, l])
            break
    if not f:
        room.append([l, [[n, l]]])
            
for i in range(len(room)):
    print(len(room[i][1]) == m and 'Started!' or 'Waiting!')
    while room[i][1]:
        print(*heapq.heappop(room[i][1])[::-1])