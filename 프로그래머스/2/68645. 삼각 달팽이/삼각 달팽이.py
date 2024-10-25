def solution(n):
    answer = []
    dr = [[1,0], [0,1], [-1,-1]]
    order = [[0 for _ in range(r+1)] for r in range(n)]
    cur, end = 1, n*(n+1)//2
    x, y, d = 0, -1, 0
    while cur <= end:
        r, c = y + dr[d][0], x + dr[d][1]
        if 0 <= r < n and 0 <= c < r+1 and order[r][c] == 0:
            order[r][c] = cur
            cur += 1
            y, x = r, c
        else:
            d = (d+1) % 3
    
    for i in range(n):
        answer.extend(order[i])
    
    return answer