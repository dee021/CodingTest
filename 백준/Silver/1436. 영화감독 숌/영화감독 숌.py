n = int(input())

y = n//20 * 10000
if n<50:
    y = n * 10000
elif n<500:
    y = y + 0.15 *y
elif n < 5000:
    pass
else:
    y = 0.6 * y

num = [x for x in range(666, int(y)) if '666' in str(x)]
print(num[n-1])