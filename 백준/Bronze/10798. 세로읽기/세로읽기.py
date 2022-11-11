r = [input() for _ in range(5)]

for j in range(15):
    for i in range(5):
        if j < len(r[i]): print(r[i][j], end='')