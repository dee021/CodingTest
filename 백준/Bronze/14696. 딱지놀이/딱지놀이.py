import sys
input = sys.stdin.readline

arr = [4,3,2,1]

for _ in range(int(input())):
    a = list(map(int, input().split()))[1:].count
    b = list(map(int, input().split()))[1:].count
    a = list(map(a, arr)); b = list(map(b, arr))
    if a == b:
        print('D')
    else:
        print(a > b and 'A' or 'B')