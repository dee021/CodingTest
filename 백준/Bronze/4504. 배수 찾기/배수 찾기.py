import sys
input = sys.stdin.readline

n = int(input())
while True:
    num = int(input())
    if not num:
        break
    if num%n:
        print('{0} is NOT a multiple of {1}.'.format(num, n))
    else:
        print('{0} is a multiple of {1}.'.format(num, n))