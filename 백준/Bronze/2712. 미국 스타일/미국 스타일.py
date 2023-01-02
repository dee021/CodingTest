unit = {'kg':[2.2046, 'lb'], 'lb':[0.4536, 'kg'], 'l':[0.2642, 'g'], 'g':[3.7854, 'l']}

for _ in range(int(input())): # test case
    data = input().split()
    value = round(float(data[0])*unit[data[1]][0], 4)
    print('%0.4f' %value, unit[data[1]][1])