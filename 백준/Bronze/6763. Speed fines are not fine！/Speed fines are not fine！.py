l = int(input())
v = int(input())

if v <= l:
    print('Congratulations, you are within the speed limit!')
else:
    v -= l
    v = [500, 270, 100][(v < 31) + (v < 21)]
    print('You are speeding and your fine is $%d.' %v)