r, b = map(int, input().split())
t = r + b
for i in range(int(r/2), 2, -1):
    for j in range(1, i+1):
        if i * j > t:
            break
        if i * j == t and 2*(i+j)-4 == r:
            print(i, j)
            exit(0)