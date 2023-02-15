import math

while True:
    try:
        n = int(input())
    except:
        break
    for m in str(math.factorial(n))[::-1]:
        if m != '0':
            ans = m
            break
    print('{:>5} -> {}'.format(n, ans))