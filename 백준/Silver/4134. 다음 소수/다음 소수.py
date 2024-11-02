import sys
input = sys.stdin.readline

def prime(k):
    if k <= 2:
        return 2
    elif k in [3,5,7]:
        return k
    if k % 2 == 0:
        k += 1
    p = 3
    while p*p <= k:
        if k%p == 0:
            k += 2
            p = 3
        else:
            p += 2
    return k

for _ in range(int(input())):
    k = int(input())
    print(prime(k))