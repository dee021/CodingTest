r, b = map(int, input().split())
t = r + b
for i in range(int(r/2), 2, -1):
    j = t/i
    if 2*(i+j)-4 == r:
        print(i, int(j))
        break