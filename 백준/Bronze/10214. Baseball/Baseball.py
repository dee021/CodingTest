import sys
input = sys.stdin.readline

for _ in range(int(input())):
    y, k = 0,0
    for _ in range(9):
        a, b = map(int, input().split())
        y += a
        k += b
    if y == k:
        print('Draw')
    else:
        print(y > k and 'Yonsei' or 'Korea')