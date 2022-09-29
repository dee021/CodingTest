ball = '1'

for _ in range(int(input())):
    a, b = input().split()
    if a == ball:
        ball = b
    elif b == ball:
        ball = a
print(ball)