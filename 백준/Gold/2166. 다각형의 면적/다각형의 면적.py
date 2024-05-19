def triangle(x1, y1, x2, y2, x3, y3):
    return (x1*y2 + x2*y3 + x3*y1) - (x2*y1 + x3*y2 + x1*y3)

def round(f):
    f = f.split('.')[1]
    if len(f) >= 2 and f[1] >= '5':
        return (int(f[0])+1)*0.1
    return int(f[0])*0.1

n = int(input())
x1, y1 = map(int, input().split())
x2, y2 = map(int, input().split())
x3, y3 = map(int, input().split())
area = triangle(x1, y1, x2, y2, x3, y3)
for _ in range(n-3):
    x2, y2 = x3, y3
    x3, y3 = map(int, input().split())
    area += triangle(x1, y1, x2, y2, x3, y3)
area = abs(1/2*area)
print(area//1+ round(str(area%1)))