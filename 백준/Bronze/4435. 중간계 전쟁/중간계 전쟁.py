import sys
input = sys.stdin.readline

gan = [1,2,3,3,4,10]
sa = [1,2,2,2,3,5,10]

for t in range(int(input())):
    g = sum(list(map(lambda x, y: x*y, map(int, input().split()), gan)))
    s = sum(list(map(lambda x, y: x*y, map(int, input().split()), sa)))
    print('Battle {0}: '.format(t+1), end='')
    if g == s:
        print("No victor on this battle field")
    elif g > s:
        print("Good triumphs over Evil")
    else:
        print("Evil eradicates all trace of Good")
