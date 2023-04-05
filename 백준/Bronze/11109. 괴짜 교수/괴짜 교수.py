ans = ['does not matter', 'parallelize', 'do not parallelize']

for _ in range(int(input())):
    d, n, s, p = map(int, input().split())
    t1 = n * s
    t2 = d + n*p
    print(ans[(t1!=t2) + (t1<t2)])