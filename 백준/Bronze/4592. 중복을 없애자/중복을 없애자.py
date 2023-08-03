import sys
input = sys.stdin.readline

while True:
    i = list(map(int, input().split()))
    if len(i) == 1:
        break
    b = i[1]; print(b, end=' ')
    for idx in range(2, len(i)):
        if i[idx] != b:
            print(i[idx], end=' ')
            b = i[idx]
    print('$')