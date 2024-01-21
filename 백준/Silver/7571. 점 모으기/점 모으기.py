import sys
input = sys.stdin.readline

def sol(lst):
    dist = 0
    s = m//2
    s = sorted(lst)[s]
    for l in lst:
        dist += abs(l-s)
    return dist

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(m)]
print(sum([sol(list(x)) for x in zip(*arr)]))