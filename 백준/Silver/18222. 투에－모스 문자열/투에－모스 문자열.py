def sol(k):
    l = 0
    while 1 << (l + 1) <= k:
        l += 1
    if 1 << l == k:
        return 1^((l+1)%2)
    else:
        return sol(k - (1<<l))^1

print(sol(int(input())))