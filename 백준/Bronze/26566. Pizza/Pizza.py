from math import pi

for _ in range(int(input())):
    a, p1 = map(int, input().split())
    per1 = a/p1
    r, p2 = map(int, input().split())
    per2 = r**2 * pi / p2
    print(per1 > per2 and 'Slice of pizza' or 'Whole pizza')