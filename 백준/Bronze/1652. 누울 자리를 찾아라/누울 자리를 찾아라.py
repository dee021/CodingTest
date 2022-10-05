c = r = 0
room = []
n = int(input())

for _ in range(n):
    line = input()
    room.append(line)
    for j in line.split('X'):
        if len(j) >= 2:
            r += 1

for i in range(n):
    cnt = 0
    for j in range(n):
        if room[j][i] == '.':
             cnt += 1
             if j == n-1 and cnt > 1:
                 c += 1
        else: # 'X'
            if cnt > 1: 
                c += 1
            cnt = 0
print(r, c)