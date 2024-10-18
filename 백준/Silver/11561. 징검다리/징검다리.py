import sys
input = sys.stdin.readline

sigma = lambda x: x*(x+1)//2

def search(k):
    l, r = 0, k
    while l <= r:
        mid = (l+r)//2
        tmp = sigma(mid)
        if tmp > k:
            r = mid -1
        else:
            l = mid +1
    return r

for _ in range(int(input())):
    print(search(int(input())))