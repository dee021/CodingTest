t = 0
tem = [int(input()) for _ in range(5)]

if tem[0] < 0:
    t += -1*tem[0]*tem[2] + tem[3]
    tem[0] = 0
t += (tem[1] - tem[0]) * tem[4]
print(t)