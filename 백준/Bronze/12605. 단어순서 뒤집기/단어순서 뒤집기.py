for i in range(int(input())):
    words = input().split()
    print('Case #{0}: {1}'.format(i+1, ' '.join(reversed(words))))