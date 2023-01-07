for _ in range(int(input())):
    s = []
    n = int(input())
    for _ in range(n):
        s.append(int(input()))
    for k in range(1, 999999):
        a = set([x%k for x in s])
        if len(a) == n:
            print(k)
            break