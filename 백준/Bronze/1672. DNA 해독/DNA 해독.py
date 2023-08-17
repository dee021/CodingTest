conv = [[0, 2, 0, 1], [2, 1, 3, 0], [0, 3, 2, 1], [1, 0, 1, 3]]
n = int(input())
s = list(input().translate(str.maketrans('AGCT', '0123')))
s = list(map(int, s))
while n > 1:
    s[-2:] = [conv[s[-1]][s[-2]]]
    n -= 1
print('AGCT'[s[0]])