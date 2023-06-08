n = int(input())

for i in range(n):
    sx,sy, ex, ey = map(int, input().split())
    p = int(input())
    cnt = 0
    for i in range(p):
        cx, cy, r = map(int, input().split())
        d1 = ((cx - sx)**2 + (cy - sy)**2)**0.5
        d2 = ((cx - ex)**2 + (cy - ey)**2)**0.5
        if d1 < r and d2 < r: # 행성계가 출발점과 도착점을 모두 포함
            continue
        elif d1 < r: # 행성계가 출발점만 포함
            pass
        elif d2 < r: # 행성계가 도착점만 포함
            pass
        else: # 그 외(우회가능)
            continue
        cnt += 1
    print(cnt)