r, c, zr, zc = map(int, input().split())
news = [input() for _ in range(r)]

for i in range(r):
    for _ in range(zr):
        print(''.join([ch*zc for ch in news[i]]))