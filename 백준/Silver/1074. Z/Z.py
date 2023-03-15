def sol(m, r, c):
    if m == 1:
        return 2*(r==1)+(c==1)
    k = 2**(m-1)
    t = 4**(m-1)*(2*(r>=k)+(c>=k))
    return t+sol(m-1, r%k, c%k)

n, r, c = map(int, input().split())
print(sol(n, r, c))