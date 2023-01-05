a, b, c, d = map(int, input().split())
p, m, n = map(int, input().split())

A = a+b; B = c+d;
for x in (p, m, n):
    print(sum([int(x%t and x%t <= s) for t, s in [[A, a],[B, c]]]))
