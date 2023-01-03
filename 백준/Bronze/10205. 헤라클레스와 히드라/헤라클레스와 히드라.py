for i in range(int(input())):
    h = int(input())
    for c in input():
        if c == 'c':
            h += 1
        else:
            h -= 1 if h >= 0 else 0
    if i > 0:
        print()
    print('Data Set %d:' %(i+1))
    print(h)