for _ in range(int(input())):
    p, m = map(int, input().split())
    s = set([input() for _ in range(p)])
    print(p-len(s))