sol = lambda x, y: len([i for i in range(len(x)) if x[i] != y[i]])

for _ in range(int(input())):
    a, b,  = input(), input()
    print('Hamming distance is %d.' %sol(a, b))