def conv(n, b):
    rt = 0
    for e in range(4, -1, -1):
        rt += n//b**e
        n %= b**e
    return rt

for i in range(1000, 10000):
    if conv(i, 10) == conv(i, 12) == conv(i, 16):
        print(i)