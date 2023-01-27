koong = [0 for _ in range(64)]
koong = [1, 1, 2, 4] + koong

for i in range(64):
    koong[i+4] = koong[i+3] + koong[i+2] + koong[i+1] + koong[i]

for _ in range(int(input())):
    print(koong[int(input())])