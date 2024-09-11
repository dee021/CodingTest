import sys
input = sys.stdin.readline

while True:
    n = int(input())
    if not n:
        break
    pages = [0 for _ in range(n+1)]
    arr = input().strip().split(',')
    for p in arr:
        if p.count('-'):
            s, e = map(int, p.split('-'))
            if s <= e:
                pages[s:min(n, e)+1] = [1] * (min(n, e)-s+1)
        elif int(p) <= n:
            pages[int(p)] = 1
    print(sum(pages))