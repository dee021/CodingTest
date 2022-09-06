angle = []
for _ in range(3):
    angle.append(int(input()))
if sum(angle) != 180:
    print('Error')
else:
    if angle[0] == angle[1] and angle[0] == 60:
        print('Equilateral')
    elif angle.count(angle[0]) == 2 or angle.count(angle[1]) == 2:
        print('Isosceles')
    else:
        print('Scalene')