import sys

def ans(num):
    num = int(num); res = 0
    for j in range(1, num):
        if num%j == 0:
            res += j
    if res < num:
        return 'Deficient'
    else:
        return 'Perfect' if res == num else 'Abundant'

t = int(sys.stdin.readline())
arr = list(map(ans, sys.stdin.readline().split()))
print('\n'.join(arr))