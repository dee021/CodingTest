x1, y1, r1 = map(int, input().split())
x2, y2, r2 = map(int, input().split())
dis = ((x1-x2)**2 + (y1-y2)**2)**0.5
print(dis < r1+r2 and 'YES' or 'NO')