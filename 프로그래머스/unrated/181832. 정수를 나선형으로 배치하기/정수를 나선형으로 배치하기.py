def solution(n):
    d = [(1,0), (0,1), (-1,0), (0, -1)]
    answer = [[0 for _ in range(n)] for _ in range(n)]
    k, x, y = 1, -1, 0
    while k <= n**2:
        for dx, dy in d:
            while 0 <= x+dx < n and 0 <= y+dy < n and not answer[y+dy][x+dx]:
                x += dx; y += dy
                answer[y][x] = k
                k += 1
    return answer