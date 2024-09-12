from collections import deque

dr = [[0,1], [0,-1], [1,0], [-1, 0]]

def check(room):
    visited = [[0 for _ in range(5)] for _ in range(5)]
    for r in range(5):
        for c in range(5):
            if room[r][c] == 'P':
                q = deque([[r, c, 0]])
                visited[r][c] = 1
                while q:
                    y, x, dis = q.popleft()
                    for dy, dx in dr:
                        if 0 <= y + dy < 5 and 0 <= x + dx < 5 and not visited[y + dy][x + dx]:
                            if room[y + dy][x + dx] == 'P':
                                return 0
                            elif dis +1 < 2 and room[y + dy][x + dx] == 'O':
                                q.append([y + dy, x + dx, dis + 1])
                            visited[y + dy][x + dx] = 1
    return 1

def solution(places):
    answer = [1 for _ in range(5)]
    
    for room in range(5):
        answer[room] = check(places[room])

    return answer