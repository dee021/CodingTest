a, b = input().split()

a = a.replace('6', '5')
b = b.replace('6', '5')
t1 = sum(map(int, [a, b]))

a = a.replace('5', '6')
b = b.replace('5', '6')
t2 = sum(map(int, [a, b]))

print(t1, t2)