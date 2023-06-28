n = int(input())
for i in range(n):
    x1, y1, r1, x2, y2, r2 = map(int,input().split())

    dis = ((x1-x2)**2 + (y1-y2)**2)**0.5 # 두 사람의 거리
    stan = r1 + r2 # 반지름의 합

    if dis == 0: # 같은 위치
        if r1 == r2:
            target = -1
        else:
            target = 0
    elif stan < dis:
        target = 0
    elif stan == dis:
        target = 1
    else:
        if dis == (r1-r2) or dis == (r2-r1):
            target = 1
        elif dis < (r1-r2) or dis < (r2-r1):
            target = 0
        else:
            target = 2
    print(target)